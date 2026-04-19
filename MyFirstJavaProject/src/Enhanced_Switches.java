import java.util.Scanner;

public class Enhanced_Switches {
    public static void main(String[] args) {
        //switch
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
            case "Saturday" -> System.out.println(day);
            case "Sunday" -> System.out.println("Sunday");
            default -> System.out.println("Invalid day name");
        }
        scanner.close();
    }
}
