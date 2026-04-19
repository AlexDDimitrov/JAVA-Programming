package Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //enums -special kind of class that represents a fixed set of constants
        //they improve code readability and are easy to maintain
        //more efficient with switches when comparing Strings

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of week: ");
        String response = scanner.nextLine();

        try {
            Day day = Day.valueOf(response.toUpperCase());
            System.out.println(day);
            System.out.println(day.getDayNumber());

            switch (day) {
                case MONDAY, TUESDAY, THURSDAY, WEDNESDAY, FRIDAY -> System.out.println("Weekday");
                case SUNDAY, SATURDAY -> System.out.println("Weekend");
            }
        }
        catch(IllegalArgumentException e) {
            System.out.println("Invalid day");
        }
        scanner.close();
    }
}
