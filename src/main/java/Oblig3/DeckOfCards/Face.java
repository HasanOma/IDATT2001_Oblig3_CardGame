package Oblig3.DeckOfCards;

public enum Face {
    ONE("Ace"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");

    private final String FACE;
    Face(String FACE) {
        this.FACE = FACE;
    }
}
