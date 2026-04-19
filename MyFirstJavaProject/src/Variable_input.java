import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Variable_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//string
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello" + ' ' + name);
//int
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("You are " + age + " years old");
//double
        System.out.print("Enter gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Your gpa is " + gpa);
//boolean
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println(isStudent ?"You are a student" :"You are not a student" );

        //common issues
        System.out.print("Enter age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favourite color: ");
        String color = scanner.nextLine();

        System.out.println(age2);
        System.out.println(color);
        scanner.close();
    }
}
