import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        for (int i = 0; i<= 10; i++) {
            System.out.println("Hello " + i + ' ' + name);
        }

        int number = 0;
        do {
            System.out.println("Enter number: ");
            number = scanner.nextInt();
        } while(number < 1);

        scanner.close();
    }
}