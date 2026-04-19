public class Nested_IF {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = true;

        double price = 9.99;
        if(isStudent) {
            if (isSenior) {
                System.out.println("DISCOUNT - 20%");
                price *= .8;
            } else {
                System.out.println("DISCOUNT - 10%");
                price *= .9;
            }
        } else if (isSenior && !isStudent) {
            System.out.println("DISCOUNT - 10%");
            price *= .9;
        }
        else {
            System.out.println("DISCOUNT - NONE");
            price *= 1;
        }

        System.out.printf("Price is %.2f\n", price);
    }
}
