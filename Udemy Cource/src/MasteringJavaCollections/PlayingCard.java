package MasteringJavaCollections;

public class PlayingCard {
    private String suit;
    private String face;
    private int internalHash;

    public PlayingCard(String suit, String face) {
        this.suit = suit;
        this.face = face;
        this.internalHash = (suit.equalsIgnoreCase("Hearts") ? 11 : 12);
    }

    @Override
    public String toString() {
        return face + " of " + suit + " " + this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        PlayingCard card = (PlayingCard) o;
        return suit.equals(card.suit) && face.equals(card.face);
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + face.hashCode();
        return result;
    }
}
