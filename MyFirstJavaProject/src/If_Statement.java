public class If_Statement {
    public static void main(String[] args) {
        int age = 25;
        // ==, =<, >=, !=, >, <,
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a child");
        }
        System.out.println((age!=25)? "True" : "False");

        String name = "";
        if (name.isEmpty()) {
            System.out.println("ERROR");
        }

        //ternary operator - ()? --- : ---
        //if () --- else ---
    }
}
