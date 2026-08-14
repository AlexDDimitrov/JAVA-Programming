package Generics.Challenge2;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {
    private static int ID = 10_000;
    private int stdID;

    private String name;
    private String course;
    private int yearStated;


    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Alex", "Teo", "Tim", "Zack", "Cathy", "John", "Bill", "Eli", "Nikola"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        stdID = ID++;
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStated = random.nextInt(2018, 2027);

    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(stdID ,name, course, yearStated);
    }

    public int getYearStated() {
        return yearStated;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStated == (Integer.parseInt(value));
            default -> false;
        };
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return Integer.valueOf(stdID).compareTo(o.stdID);
    }
}
