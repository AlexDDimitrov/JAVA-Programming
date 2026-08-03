package Arrays;

import java.util.Arrays;

public class TwoDArrays {
    static void main(String[] args) {

        int[][] arr = new int[4][4];
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr.length);

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
            var avar = a;
            System.out.println(avar[1]);
        }

        int[][] array2 = new int[3][4];

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (var line : array2) {
            for (var e : line) {
                System.out.print(e + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                // System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
            // System.out.println();
        }

        System.out.println();

        for (var line : array2) {
            for (var e : line) {
                System.out.print(e + " ");
            }
            System.out.println();
        }


    }
}
