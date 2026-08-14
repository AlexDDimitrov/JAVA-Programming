package JavaLambdaExpressions.MiniChallenges;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class main {
    static void main(String[] args) {
        Consumer<String> printWords = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printWords.accept("Lets put this into array");

        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i+=2) {
                returnVal.append(source.charAt(i));
            }
            return returnVal.toString();
        };

        var textToPrint = everySecondChar.apply("1234567890");
        System.out.println(textToPrint);

        System.out.println(everySecondCharacter(everySecondChar, "1234567890"));

        Supplier<String> iLoveJava = () -> "I love Java!";
        System.out.println(iLoveJava.get());
    }

    static <T extends Function<String, String>> String everySecondCharacter(T function, String text) {
        String ttp = "";

        ttp = function.apply(text);

        return ttp;
    }
}
