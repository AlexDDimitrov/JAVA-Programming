public class Overloaded_Methods {
    public static void main(String[] args){
        //overloaded methods

        System.out.println(add(1, 2, 3, 4));
    }

    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}
