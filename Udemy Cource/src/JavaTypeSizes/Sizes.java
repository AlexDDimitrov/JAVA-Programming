package JavaTypeSizes;

public class Sizes {
    public void main() {
        // byte
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        // short
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        // int
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // long
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // float
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE); // Note: This represents the smallest positive non-zero value

        // double
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE); // Note: This represents the smallest positive non-zero value

        // char
        System.out.println((int) Character.MAX_VALUE); // Displays numeric value (65535)
        System.out.println((int) Character.MIN_VALUE); // Displays numeric value (0)

        // boolean
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);

        byte a = 1, b = 2;
        System.out.println(a + ", " + b);

        byte c = 4;
        //error -> byte d = (c/2) <- treats as int
        byte d = (byte) (c/2);
    }
}
