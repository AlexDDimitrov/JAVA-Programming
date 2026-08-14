package MasteringJavaCollections;

import java.util.*;

public class DeckOfCards {
    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts",1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println(cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');

        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards);

        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards);

        Collections.shuffle(deck);
        Card.printDeck(deck);

        Collections.reverse(deck);
        Card.printDeck(deck);

        var sortingAlg = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sortingAlg);
        Card.printDeck(deck);

        Collections.reverse(deck);
        Card.printDeck(deck);

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings);

        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens);

        int subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println(subListIndex);

        System.out.println(deck.containsAll(tens));

        boolean disjoint = Collections.disjoint(deck, tens);
        System.out.println(disjoint);

        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println(disjoint2);

        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlg.reversed());
        //                                                                      ^reversed it due to me reversing the deck on line ~49

        System.out.println(foundIndex);
        System.out.println(deck.get(foundIndex));

        foundIndex = Collections.binarySearch(deck, kingOfClubs, sortingAlg.reversed());

        System.out.println(foundIndex);
        System.out.println(deck.get(foundIndex));

        Collections.replaceAll(deck, Card.getNumericCard(Card.Suit.CLUB, 10), tenOfHearts);

        deck.sort(sortingAlg);
        Card.printDeck(deck.subList(32, 36));

        System.out.println(Collections.frequency(deck, tenOfHearts));
        System.out.println(Collections.max(deck, sortingAlg) + " " + Collections.min(deck, sortingAlg));

        List<Card> copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, 2);
        //          moves from back to start
        System.out.println(copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, -2);
        //          moves from front to back (-)
        System.out.println(copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        System.out.println(copied);
        for ( int i = 0; i < copied.size() / 2; i++) {
            Collections.swap(copied, i, copied.size() - 1 - i);
        }
        System.out.println(copied);


    }
}
