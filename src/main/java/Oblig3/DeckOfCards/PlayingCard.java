package Oblig3.DeckOfCards;

public class PlayingCard {
    private Suit suit;
    private Face face;

    public PlayingCard(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    public Suit getSuit() {
        return suit;
    }

    public Face getFace() {
        return face;
    }

}
