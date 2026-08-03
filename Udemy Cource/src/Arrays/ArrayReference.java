package Arrays;

import java.util.Arrays;

public class ArrayReference {
    static void main(String[] args) {
        int[] arr = new int[5];

        int[] anotherArr = arr;

        anotherArr[4] = 1;
        System.out.println(Arrays.toString(arr));
    }
}
