package ConsoleInput;

import java.util.Scanner;

public class ParsingValues {
    static Scanner scanner;

    static void main(String[] args) {

        int currentYear = 2026;
        //String usersDateOfBirth = "1999";

        //System.out.println("Age = " + (currentYear - Integer.parseInt(usersDateOfBirth)));

        //Integer.parseInt()
        //Double.parseDouble()
        //Float.parseFloat()

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("What is your name: ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("When were you born: ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        scanner = new Scanner(System.in);

        //String name = System.console().readLine("What is your name: ");
        System.out.println("What is your Name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year were you born? ");

        boolean isValidDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                isValidDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!");
            }
        } while (!isValidDOB);

        scanner.close();

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);

        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}
