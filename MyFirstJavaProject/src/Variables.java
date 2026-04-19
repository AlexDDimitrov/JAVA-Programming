import org.w3c.dom.ls.LSOutput;

public class Variables {
    public static void main(String[] args) {
        //primitive types - int, double, char, boolean
        //reference types - string, array, object

        int age = 21;
        System.out.println(age+3);

        int year = 2026;
        int quantity = 1;
        System.out.println(quantity);
        System.out.println("The year is" + ' ' + year);

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;
        System.out.println("$" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(grade);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;
        System.out.println(isStudent);
        if (forSale) {
            System.out.println("On sale");
        } else if (isOnline) {
            System.out.println("Online");
        } else {
            System.out.println("None");
        }

        String name = "COA";
        String email = "hello@email.com";
        System.out.println("Hello" + ' ' + name);
        System.out.println("Your Email is" + ' ' + email);

        System.out.println("Hello" + ' ' + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);
        System.out.println("Your grade is " + grade);

        String color = "red";
        String car = "Mustang";
        System.out.println("Your choice is a " + color + ' ' + year + ' ' + car);
        System.out.println("The prove is: " + currency + price*29344.42);
        forSale = true;
        if (forSale) {
            System.out.println("For SALE");
        } else {
            System.out.println("Not For SALE");
        }
    }
}
