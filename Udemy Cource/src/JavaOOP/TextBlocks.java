package JavaOOP;

public class TextBlocks {
    static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t• First Point\n" +
                "\t\t• Sub Point\n";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted list:
                    • First Point
                        • Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d\n", age);

        int yearOfBirth = 2026 - age;

        System.out.printf("Age = %d, Birth year = %.2f %n", age, (float) yearOfBirth);

        System.out.printf("a %n a %n");
        System.out.printf("a \n a");

        System.out.println();
        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedStr = String.format("Your age is %d", age);
        System.out.println(formattedStr);

        formattedStr = "Your age is %d".formatted(age);
        System.out.println(formattedStr);
    }
}
