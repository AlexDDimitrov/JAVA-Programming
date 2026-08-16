package MasteringMutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnmodifiableViews {
    public static void main(String[] args) {

        StringBuilder bobsNotes = new StringBuilder();
        StringBuilder billsNotes = new StringBuilder("Bill struggles with generics");

        Std bob = new Std("Bob", bobsNotes);
        Std bill = new Std("Bill", billsNotes);

        List<Std> Stds = new ArrayList<>(List.of(bob, bill));
        List<Std> StdsFirstCopy = new ArrayList<>(Stds);
        List<Std> StdsSecondCopy = List.copyOf(Stds);
        List<Std> StdsThirdCopy = Collections.unmodifiableList(Stds);

        StdsFirstCopy.add(new Std("Bonnie", new StringBuilder()));
//        StdsThirdCopy.set(0, new Std("Bonnie", new StringBuilder()));
        StdsFirstCopy.sort(Comparator.comparing(Std::getName));
        Stds.add(new Std("Bonnie", new StringBuilder()));
        bobsNotes.append("Bob was one of my first Stds.");

        StringBuilder bonniesNotes = StdsFirstCopy.get(2).getNotes();
        bonniesNotes.append("Bonnie is taking 3 of my courses");

        Stds.forEach(System.out::println);
        System.out.println("-----------------------");
        StdsFirstCopy.forEach(System.out::println);
        System.out.println("-----------------------");
        StdsSecondCopy.forEach(System.out::println);
        System.out.println("-----------------------");
        StdsThirdCopy.forEach(System.out::println);
        System.out.println("-----------------------");
    }

}

class Std {
    private final String name;
    private final StringBuilder notes;

    public Std(String name, StringBuilder notes) {
        this.name = name;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public StringBuilder getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Std{" +
                "name='" + name + '\'' +
                ", notes=" + notes +
                '}';
    }
}