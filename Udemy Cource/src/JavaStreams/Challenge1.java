package JavaStreams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Challenge1 {

    static int c = 0;
    static void main(String[] args) {
        int seed = 1;
        var streamB = Stream.iterate(seed, i -> i <= 15, i -> i + 1)
                .map(i -> "B" + i);
//        streamB.forEach(System.out::println);

        seed += 15;

        var streamI = Stream.iterate(seed, i -> i + 1)
                .limit(15)
                .map(i -> "I" + i);

        seed += 15;
        final int nSeed = seed;
        String[] oLabel = new String[15];
        Arrays.setAll(oLabel, i -> "N" + (nSeed + i));
        var streamN = Arrays.stream(oLabel);

//        streamI.forEach(System.out::println);
//        streamN.forEach(System.out::println);

        seed += 15;
        var streamG = Stream.of("G46", "G47", "G48", "G49", "G50",
                "G51", "G52", "G53", "G54", "G55", "G56", "G57", "G58", "G59", "G60");

//        streamG.forEach(System.out::println);

        seed += 15;
        int rSeed = seed;

        //has side effects
        var streamO = Stream.generate(Challenge1::getC)
                .limit(15)
                .map(i -> "O" + (rSeed + i));

//        streamO.forEach(System.out::println);

        var streamBI = Stream.concat(streamB, streamI);
        var streamNG = Stream.concat(streamN, streamG);
        var streamBING = Stream.concat(streamBI, streamNG);
        Stream.concat(streamBING, streamO)
                .forEach(System.out::println);

        System.out.println("---------------------------------------------");
        Stream.generate(() -> new Random().nextInt(rSeed, rSeed + 15))
                .distinct()
                .limit(15)
                .map(i -> "O" + i)
                .sorted()
                .forEach(System.out::println);

    }

    static int getC() {
        return c++;
    }
}
