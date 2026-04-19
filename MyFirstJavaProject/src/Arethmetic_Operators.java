public class Arethmetic_Operators {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z;
        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        //z = x % y;
        z = x * y - y;
        System.out.println(z);
        //x += y;
        //x -= y;
        //x *= y;
        //x /= y;
        //x %= y;
        //x++;

        //P-E-M-D-A-S
        double res = 3 + 4 * (7 - 5) / 2.13;
        System.out.println(res);
    }

    public static class Wrapper_Classes {
        public void main(String[] args) {
            // wrapper classes allow primitive values to be used as objects
            //generally DO NOT wrap primitives un;ess you need an object
            //allows use of collections framework and static utility methods

            //Integer a = new Integer(123);
            //Double b = new Double(3.14);
            //Character c = new Character('$');
            //Boolean d = new Boolean(true);

            //autoboxing:
            /*Integer a = 123;
            Double b = 3.14;
            Character c = '$';
            Boolean d = true;
            String e = "Pizza";

            //unboxing:
            int x = a;*/

            /*String a = Integer.toString(123);
            String b = Double.toString(3.14);
            String c = Character.toString('$');
            String d = Boolean.toString(true);

            String x = a + b + c + d;
            System.out.println(x);*/

            int a = Integer.parseInt("123");
            double b = Double.parseDouble("3.14");
            char c = "Pizza".charAt(0);
            boolean d = Boolean.parseBoolean("true");

            char letter = 'b';
            System.out.println(Character.isLetter(letter));
            char letter2 = '$';
            System.out.println(Character.isLetter(letter2));

            System.out.println(Character.isUpperCase(letter));

            letter = 'B';
            System.out.println(Character.isUpperCase(letter));
        }
    }
}
