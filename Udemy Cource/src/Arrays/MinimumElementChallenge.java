package Arrays;

import java.util.*;

public class MinimumElementChallenge {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);

        reverse(returnedArray);
        System.out.println(Arrays.toString(returnedArray));
    }


    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int e : array) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }

    //Challenge 2 Reverse Array
    private static void reverse(int[] arr) {
        int maxIndex = arr.length - 1;
        int hl = arr.length / 2;

        for (int i = 0; i < hl; i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }


    }
}
