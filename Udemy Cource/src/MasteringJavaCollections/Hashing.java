package MasteringJavaCollections;

import java.util.*;

public class Hashing {
    static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";

        String c = String.join("l", "He", "lo");
        String d = "He".concat("llo");

        String e = "hello";

        List<String> hellos = new ArrayList<>(Arrays.asList(a, b ,c, d, e));

        hellos.forEach(s -> System.out.println(s + " " + s.hashCode()));

        Set<String> stringHashSet = new HashSet<>(hellos);
        System.out.println(stringHashSet + " " + stringHashSet.size());

        stringHashSet.forEach(System.out::println);

        PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenSpades = new PlayingCard("Spades", "Queen");

        List<PlayingCard> playingCardList = Arrays.asList(aceHearts, kingClubs, queenSpades);
        playingCardList.forEach(System.out::println);

        Set<PlayingCard> deck = new HashSet<>();
        for (PlayingCard card : playingCardList) {
            if (!deck.add(card)) {
                System.out.println("Found duplicate: " + card);
            }
        }

        System.out.println(deck);
    }
}
