package MasteringJavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

record Belot(Suit suit, String face, int rank) {

    enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage() {
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }

    @Override
    public String toString() {

        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }

    public static Belot getNumericCard(Suit suit, int cardNumber) {

        if (cardNumber > 1 && cardNumber < 11) {
            return new Belot(suit, String.valueOf(cardNumber), cardNumber - 2);
        }
        System.out.println("Invalid Numeric card selected");
        return null;
    }

    public static Belot getFaceCard(Suit suit, char abbrev) {

        int charIndex = "JQKA".indexOf(abbrev);
        if (charIndex > -1) {
            return new Belot(suit, "" + abbrev, charIndex + 9);
        }
        System.out.println("Invalid Face card selected");
        return null;
    }

    public static List<Belot> getStandardDeck() {

        List<Belot> deck = new ArrayList<>(52);
        for (Suit suit : Suit.values()) {
            for (int i = 7; i <= 10; i++) {
                deck.add(getNumericCard(suit, i));
            }
            for (char c : new char[]{'J', 'Q', 'K', 'A'}) {
                deck.add(getFaceCard(suit, c));
            }
        }
        return deck;
    }

    public static void printDeck(List<Belot> deck) {
        printDeck(deck, "Current Deck", 4);
    }

    public static void printDeck(List<Belot> deck, String description, int rows) {

        System.out.println("-".repeat(30));
        if (description != null) {
            System.out.println(description);
        }
        int cardsInRow = deck.size() / rows;
        for (int i = 0; i < rows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }

}


public class CardDeckChallenge {

    static void main(String[] args) {
        List<Belot> p1 = new ArrayList<>();
        List<Belot> p2 = new ArrayList<>();
        List<Belot> p3 = new ArrayList<>();
        List<Belot> p4 = new ArrayList<>();

        List<Belot> deck = Belot.getStandardDeck();
        Collections.shuffle(deck);

        p1.addAll(deck.subList(0, 3));
        p2.addAll(deck.subList(3, 6));
        p3.addAll(deck.subList(6, 9));
        p4.addAll(deck.subList(9, 12));

        p1.addAll(deck.subList(12, 14));
        p2.addAll(deck.subList(14, 16));
        p3.addAll(deck.subList(16, 18));
        p4.addAll(deck.subList(18, 20));

        List<Belot> copied = new ArrayList<>(deck.subList(20, 32));
        Collections.rotate(copied, 6);

        p1.addAll(copied.subList(0, 3));
        p2.addAll(copied.subList(3, 6));
        p3.addAll(copied.subList(6, 9));
        p4.addAll(copied.subList(9, 12));

        System.out.println("Player 1 Hand Size: " + p1.size() + " cards.");
        System.out.println("Player 2 Hand Size: " + p2.size() + " cards.");
        System.out.println("Player 3 Hand Size: " + p3.size() + " cards.");
        System.out.println("Player 4 Hand Size: " + p4.size() + " cards.");

        System.out.println("\nHands Overview:");
        Belot.printDeck(p1, "Player 1 Hand", 1);
        Belot.printDeck(p2, "Player 2 Hand", 1);
        Belot.printDeck(p3, "Player 3 Hand", 1);
        Belot.printDeck(p4, "Player 4 Hand", 1);
    }
}
