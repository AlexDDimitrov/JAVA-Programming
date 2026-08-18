package JavaStreams;

import java.util.*;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i + 1)
                .filter(Character::isAlphabetic)
                .map(Character::toUpperCase)
                .distinct()
//                .dropWhile(i -> Character.toUpperCase(i) <= 'E')
//                .takeWhile(i -> i < 'E')
//                .skip(5)
//                .filter(i -> Character.toUpperCase(i) > 'E')
                .forEach(d -> System.out.printf("%c ", d));

        System.out.println();
        Random random = new Random();

        Stream.generate(() -> random.nextInt((int)'A', (int)'Z' + 1))
                .limit(50)
//                .distinct()
                .sorted()
                .forEach(d -> System.out.printf("%c ", d));

        System.out.println();
        int maxSeats = 100;
        int seatsInRow = 10;
        var stream =
                Stream.iterate(0, i -> i < maxSeats, i -> i + 1)
                        .map(i -> new Seat((char) ('A' + i / seatsInRow),
                                i % seatsInRow + 1))
                        .skip(5)
                        .limit(10)
                        .peek(s -> System.out.println("--> " + s))
                        //^mainly for debugging
                        .sorted(Comparator.comparing(Seat::price)
                                .thenComparing(Seat::toString));
//                        .mapToDouble(Seat::price);
//                        .boxed();
//                        .map("%.2f"::formatted);
        stream.forEach(System.out::println);

        var result = IntStream
                .iterate(0, i -> i <= 1000, i -> i = i + 3)
                .summaryStatistics();
        System.out.println("Result = " + result);

        var leapYearData = IntStream
                .iterate(2000, i -> i <= 2025, i -> i = i + 1)
                .filter(i -> i % 4 == 0)
                .peek(System.out::println)
                .summaryStatistics();
        System.out.println("Leap Year Data = " + leapYearData);

        Seat[] seats = new Seat[100];
        Arrays.setAll(seats, i -> new Seat((char) ('A' + i / 10), i % 10 + 1));
//        Arrays.asList(seats).forEach(System.out::println);

        long reservationCount = Arrays
                .stream(seats)
                .filter(Seat::isReserved)
                .count();
        System.out.println("reservationCount = " + reservationCount);

        boolean hasBookings = Arrays
                .stream(seats)
                .anyMatch(Seat::isReserved);
        System.out.println("hasBookings = " + hasBookings);

        boolean fullyBooked = Arrays
                .stream(seats)
                .allMatch(Seat::isReserved);
        System.out.println("fullyBooked = " + fullyBooked);

        boolean eventWashedOut = Arrays
                .stream(seats)
                .noneMatch(Seat::isReserved);
        System.out.println("eventWashedOut = " + eventWashedOut);
    }
}
