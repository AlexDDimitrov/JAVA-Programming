package Arrays;

public class VarArgs {
    static void main(String... args) {
        System.out.println("Hello world");

        String[] splitStr = "Hello World Again".split(" ");
        printText(splitStr);
        System.out.println("-".repeat(20));
        printText2("Hello", "Hi", "World");
        printText2();
    }

    private static void printText(String[] textlist) {
        for (String s : textlist) {
            System.out.println(s);
        }
    }

    private static void printText2(String... textlist) {
        for (String s : textlist) {
            System.out.println(s);
        }
    }
}
