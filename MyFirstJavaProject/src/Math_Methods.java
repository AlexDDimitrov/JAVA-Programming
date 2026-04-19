import java.util.Random;

public class Math_Methods {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);
        double x = Math.PI;

        double result = Math.pow(x, x);
        System.out.println(result);

        result = Math.pow(2, 5);
        System.out.println(result);

        result = Math.abs(-5);
        System.out.println(result);

        result = Math.sqrt(Math.PI);
        System.out.println(result);

        result = Math.sqrt(9);
        System.out.println(result);

        result = Math.round(Math.PI);
        System.out.println(result);

        result = Math.ceil(Math.PI);
        System.out.println(result);

        result = Math.floor(Math.PI);
        System.out.println(result);

        result = Math.max(Math.PI, Math.E);
        System.out.println(result);

        result = Math.min(Math.PI, Math.E);
        System.out.println(result);

        result = Math.sqrt(Math.pow(Math.PI, 2) + Math.pow(Math.E, 2));
        System.out.println(result);
    }
}
