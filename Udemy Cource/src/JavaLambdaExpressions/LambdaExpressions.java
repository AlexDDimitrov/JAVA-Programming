package JavaLambdaExpressions;

import java.util.*;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class LambdaExpressions {
    static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-".repeat(7));

        list.forEach(myString -> System.out.println(myString));

        System.out.println("-".repeat(7));

        String prefix = "nato";
        list.forEach(myString -> {
            System.out.println(myString.toLowerCase() + " means " + myString.toLowerCase().charAt(0));
            System.out.println((prefix + " ").repeat(7));
        });

//        prefix = "NATO"
//          error^

//        System.out.println(myString);
//                           error^

        int result = calculator((a, b) -> a + b, 5, 2);
//                              ^   Operation<T> function   ^

        result = calculator((a, b) -> a % b, 5, 2);

        result = calculator((a, b) -> a / b, 5, 2);

        result = calculator((a, b) -> a - b, 5, 2);

        result = calculator((a, b) -> a * b, 5, 2);

        String result2 = calculator((a, b) -> a.toUpperCase() + b, "Alex", "Dimitrov");

        var coords = Arrays.asList(new double[] {
           47.2160, -95.2348},
                new double[] {29.1599, -89.2495}
        );

        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double,Double> p1 = (lat, lng) ->
                System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);

        System.out.println("-------");
        coords.forEach(s -> processPoint(s[0], s[1], p1));
        coords.forEach(s -> processPoint(s[0], s[1],
                (lat, lng) ->
                        System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng)));

        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.forEach(s -> System.out.println(s));

        list.addAll(List.of("echo", "easy", "earnest"));
        list.forEach(s -> System.out.println(s));

        System.out.println("-------");
        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(s -> System.out.println(s));

        System.out.println("-------");
        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(s -> System.out.println(s));

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("-------");
        list.forEach(s -> System.out.println(s));

        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.fill(emptyStrings,"");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, (i) -> "" + (i + 1) + ". ");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, (i) -> "" + (i + 1) + ". "
                        + switch (i) {
                    case 0 -> "one";
                    case 1 -> "two";
                    case 2 -> "three";
                    default -> "";
                }
        );
        System.out.println(Arrays.toString(emptyStrings));

        String[] names = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
        String[] randomList = randomlySelectedValues(15, names,
                () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));
        System.out.println("-------");
        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(s -> System.out.println(s));

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("-------");
        list.forEach(s -> System.out.println(s));

        String[] emptyStrings2 = new String[10];
        System.out.println(Arrays.toString(emptyStrings2));
        Arrays.fill(emptyStrings2,"");
        System.out.println(Arrays.toString(emptyStrings2));

        Arrays.setAll(emptyStrings2, (i) -> "" + (i + 1) + ". ");
        System.out.println(Arrays.toString(emptyStrings2));

        Arrays.setAll(emptyStrings2, (i) -> "" + (i + 1) + ". "
                        + switch (i) {
                    case 0 -> "one";
                    case 1 -> "two";
                    case 2 -> "three";
                    default -> "";
                }
        );
        System.out.println(Arrays.toString(emptyStrings));

        String[] names2 = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
        String[] randomList2 = randomlySelectedValues(15, names2,
                () -> new Random().nextInt(0, names2.length));
        System.out.println(Arrays.toString(randomList2));

    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {

        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer) {
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count,
                                                  String[] values,
                                                  Supplier<Integer> s) {

        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}
