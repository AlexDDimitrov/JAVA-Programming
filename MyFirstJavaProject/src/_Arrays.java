import java.util.Arrays;

public class _Arrays {
    public static void main(String[] args){

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        for (int i = 0; i<fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);
        fruits[3] = "tomato";
        for (int i = 0; i<fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println();
        Arrays.sort(fruits);
        //enhanced for loop:
        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        System.out.println();
        Arrays.fill(fruits, "blueberry");
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}
