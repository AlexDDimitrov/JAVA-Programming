package JavaInputOutput;

import MasteringMutability.Challenge.Player;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//compatable chnages
// adding fields
// adding writeObject, readObject methods
// changing access to field
// changing static to nonstatic or transient
// https://docs.oracle.com/en/java/javase/17/docs/specs/serialization/version.html#compatible-changes

class Player2 implements Serializable {
    private final static long serialVersionUID = 1L;
    private final static int version = 2;

    private String name;
    private transient long topScore;
    //      ^transient here doesn't do anything because we have our own read and write file code
    private List<String> collectedWeapons = new LinkedList<>();
    private long bigScore;
    private final transient long accountID;

    public Player2(long accountID, String name, int topScore, List<String> collectedWeapons) {
        this.accountID = accountID;
        this.name = name;
        this.topScore = topScore;
        this.collectedWeapons = collectedWeapons;
        //changed topscore to biScore so now when reading the file, although we have topScore = 100000010 saved when reading bigScore will be zero
        //changing ArrayList to LinkedList won't have any changes to the saved data when read
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + accountID + ", " +
                "name='" + name + '\'' +
                ", topScore=" + topScore +
                ", collecttiedWeapons=" + collectedWeapons +
                '}';
    }

    @Serial
    @SuppressWarnings("unchecked")
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
//        stream.defaultReadObject();
//        bigScore = bigScore == 0 ? 1_000_000_000L : bigScore;

        var serializerVer = stream.readInt();
        collectedWeapons = (List<String>) stream.readObject();
        name = stream.readUTF();
        topScore = serializerVer == 1 ? stream.readInt() : stream.readLong();

    }

    @Serial
    private void writeObject(ObjectOutputStream stream) throws IOException{
        System.out.println("---> Customized Writing");

        stream.writeInt(version);
        stream.writeObject(collectedWeapons);
        stream.writeUTF(name);
        stream.writeLong(topScore);
    }
}

public class MasteringBinaryData {
    static void main(String[] args) {
//        Path path = Path.of("data.dat");
//        writeData(path);
//        readData(path);

        Player2 tim = new Player2(555, "Tim", 100_000_010, List.of("knife", "machete", "pistol"));

        System.out.println(tim);

        Path timFile = Path.of("tim.dat");
        //we are not adding this^
//        writeObject(timFile, tim);
        Player2 player = readObject(timFile);
        System.out.println(player);

        Player2 joe = new Player2(556, "Joe", 75, List.of("rifle", "sword", "crossbow"));
        Path joeFile = Path.of("joe.dat");

        writeObject(joeFile, joe);
        Player2 reconstitutedJoe = readObject(joeFile);
        System.out.println(joe);
        System.out.println(reconstitutedJoe);
        //due to having transient field in the declaration of accountID, it wasn't added to the file so it returns 0
    }

    private static void writeData(Path dataFile) {
        try(DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile.toFile())));) {
            int myInt = 17;
            long myLong = 100_000_000_000_000l;
            boolean myBoolean = true;
            char myChar = 'Z';
            float myFloat = 77.7f;
            double myDouble = 98.6;
            String myString = "Hello World";

            long position = 0;
            dataOutputStream.writeInt(myInt);
            System.out.println("writeInt: " + (dataOutputStream.size() - position));
            position = dataOutputStream.size();

            dataOutputStream.writeLong(myLong);
            System.out.println("writeLong: " + (dataOutputStream.size() - position));
            position = dataOutputStream.size();

            dataOutputStream.writeBoolean(myBoolean);
            System.out.println("writeBoolean: " + (dataOutputStream.size() - position));
            position = dataOutputStream.size();

            dataOutputStream.writeChar(myChar);
            System.out.println("writeChar: " + (dataOutputStream.size() - position));
            position = dataOutputStream.size();

            dataOutputStream.writeFloat(myFloat);
            System.out.println("writeFloat: " + (dataOutputStream.size() - position));
            position = dataOutputStream.size();

            dataOutputStream.writeDouble(myDouble);
            System.out.println("writeDouble: " + (dataOutputStream.size() - position));
            position = dataOutputStream.size();

            dataOutputStream.writeUTF(myString);
            System.out.println("writeUTF: " + (dataOutputStream.size() - position));
            position = dataOutputStream.size();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readData(Path dataFile) {
        try (DataInputStream dataStream = new DataInputStream(Files.newInputStream(dataFile))) {
            System.out.println("myInt = " + dataStream.readInt());
            System.out.println("myLong = " + dataStream.readLong());
            System.out.println("myBoolean = " + dataStream.readBoolean());
            System.out.println("myChar = " + dataStream.readChar());
            System.out.println("myFloat = " + dataStream.readFloat());
            System.out.println("myDouble = " + dataStream.readDouble());
            System.out.println("myString = " + dataStream.readUTF());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeObject(Path path, Player2 player) {
        try(ObjectOutputStream objectStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectStream.writeObject(player);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Player2 readObject(Path path) {
        try(ObjectInputStream objectStream = new ObjectInputStream(Files.newInputStream(path))) {
            return (Player2) objectStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
