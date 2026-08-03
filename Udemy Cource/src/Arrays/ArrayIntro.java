package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayIntro {
    static void main(String[] args) {
        int[] arr = new int[10];

        arr[5] = 50;
        arr[0] = (int) 45.0;
        arr[1] = (int) '1';

        double[] arr2 = new double[10];
        arr2[2] = 3.5;
        System.out.println(arr2[2]);
        System.out.println();

        int[] arr3 = {1, 2, 3, 4, 5};
        //int[] arr3 = new int[]{1, 2, 3, 4, 5};

        System.out.println(arr3[0]);
        System.out.println();
        System.out.println(arr3.length);
        System.out.println();
        System.out.println(arr3[arr3.length-1]);
        System.out.println();

        int[] newArray;
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        //enhanced for loop like in python:
        //for item in items
        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(newArray);
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;

        for (Object item : objectArray) {
            System.out.print(item + " ");
        }
        System.out.println("\n");

        int[] arr4 = getRandomArray(10);
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println();

        int[] sarr = new int[10];
        System.out.println(Arrays.toString(sarr));
        Arrays.fill(sarr, 5);
        System.out.println(Arrays.toString(sarr));

        System.out.println();

        int[] tarr = getRandomArray(10);
        System.out.println(Arrays.toString(tarr));

        int[] farr = Arrays.copyOf(tarr, tarr.length + 5);
        System.out.println(Arrays.toString(farr));

        Arrays.sort(farr);
        System.out.println(Arrays.toString(tarr));
        System.out.println(Arrays.toString(farr));

        System.out.println();
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Yep");
        }

        System.out.println();
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Yep");
        } else {
            System.out.println("Nope");
        }

    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(1000);
        }

        return arr;
    }
}
