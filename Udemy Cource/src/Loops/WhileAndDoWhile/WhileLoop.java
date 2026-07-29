package Loops.WhileAndDoWhile;

public class WhileLoop {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        int j = 1;
//        boolean isReady = false;
//        do {
//            if (j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//            isReady = (j > 0);
//        } while (isReady);

        int number = 0;
        WhileLoop(number);

        number = 0;

        System.out.println();

        do {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        } while (number <= 50);
    }

    private static void WhileLoop(int number) {
        while (number <= 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
