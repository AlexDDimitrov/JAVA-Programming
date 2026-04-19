import java.util.Arrays;

public class Search_in_Array {
    public static void main(String[] args){

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};
        String target = "orange";
        boolean isFound = false;
        /*for(int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]) {
                System.out.println("Target found - " + i);
                isFound = true;
                break;
            }
        }*/

        for (String fruit: fruits) {
            if (fruit.equals(target)) {
                System.out.println("Target found");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Not found");
        }
    }
}
