public class Methods {

    public static void main(String[] args) {

        String name = "Alex";
        int age = 15;
        for (int i = 0; i<3; i++) {
            happyBirthday(name, age);
        }
        double a = Math.PI*Math.E;
        System.out.println(a);
        a = square(a);
        System.out.println(a);

        name = fullName("Alex", "Dimitrov");
        System.out.println(name);
    }

    static void happyBirthday(String firtsName, int age) {
        System.out.println("Happy birthday to " + firtsName + "!");
        System.out.println("Happy birthday dear " + firtsName + "!");
        System.out.println("You are " + age + " years old!");
        System.out.println("Happy birthday to " + firtsName + "!");
        System.out.println();
    }

    static double square(double number) {
        return number * number;
    }

    static String fullName(String firstName, String secondName) {
        return firstName + " " + secondName;
    }
}
