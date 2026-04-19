import java.util.Random;

public class Random_Numbers {
    public static void main(String[] args) {
        Random random = new Random();

        int number1, number2, number3;
        number1 = random.nextInt(1, 6);
        number2 = random.nextInt(1, 6);
        number3 = random.nextInt(1, 6);

        System.out.println("n1 " + number1 + " n2 " + number2 + " n3 " + number3);

        boolean coin;
        coin = random.nextBoolean();
        System.out.println(coin);

        double grade;
        grade = random.nextDouble(2, 6);
        System.out.println(grade);
    }
}
