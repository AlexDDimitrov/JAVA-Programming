package Writing_In_Files;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Audio_Player {
    public static  void main(String[] args) {
        String filePath = "src\\Writing_In_Files\\Buckshot Roulette General Release.wav";
        File file = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); Scanner scanner = new Scanner(System.in);){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            System.out.println("No problems detected");

            String response = "";
            while(!response.equals("Q")) {
                System.out.println("P = play");
                System.out.println("S = stop");
                System.out.println("R = reset");
                System.out.println("Q = quit");
                System.out.print("Enter choice: ");
                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.stop();
                    default -> System.out.println("Invalid choicep");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not located");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Pick different type of audio file");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        catch(IOException e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("Bye");
        }
    }
}
