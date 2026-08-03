package MasteringMoreJavaTypesAndArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoboxingAndUnboxing {

    static void main(String[] args) {
        //manual boxing and unboxing
        Integer boxedInt = Integer.valueOf(15); //preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); //deprecated since JDK 9
        int unboxedInt = boxedInt.intValue(); //unnecessary


        //auto
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        System.out.println(resultBoxed);
        System.out.println(resultUnboxed);

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());


        Character[] characters = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characters));

        var list = getList(1, 2, 3, 4, 5);
        System.out.println(list);
    }

    private static ArrayList<Integer> getList(Integer... varargs) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : varargs) {
            arrayList.add(i);
        }
        return arrayList;
    }

    private static int returnInt(Integer i) {
        return i;
    }

    private static Integer returnInteger(int i) {
        return i;
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.00;
    }
}