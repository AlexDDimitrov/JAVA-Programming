package Arrays;

import java.util.Arrays;

public class MultyDimensionalArrays {
    static void main(String[] args) {
        int[][] array2 = new int[4][4];
        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                // System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
            // System.out.println();
        }
        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArr = new Object[3];
        System.out.println(Arrays.toString(anyArr));

        anyArr[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArr));

        anyArr[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"},
                {"10"}
        };
        System.out.println(Arrays.deepToString(anyArr));

        anyArr[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArr));

        for(Object e : anyArr) {
            System.out.println("Element type = " + e.getClass().getSimpleName());
            System.out.println(Arrays.deepToString((Object[]) e));
        }
    }

}
