package Generics.Wildcards;

import java.util.Random;

public class Student implements QueryItem{
    private String name;
    private String course;
    private int yearStated;


    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Alex", "Teo", "Tim", "Zack", "Cathy", "John", "Bill", "Eli", "Nikola"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStated = random.nextInt(2018, 2027);

    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStated);
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
}
