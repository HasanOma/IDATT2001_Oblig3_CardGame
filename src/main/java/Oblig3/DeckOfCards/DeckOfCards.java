package Oblig3.DeckOfCards;

import java.util.ArrayList;

public class DeckOfCards {
    private ArrayList<PlayingCard> playingCards;

    public DeckOfCards() {
        this.playingCards = new ArrayList<>(51);
    }

    public ArrayList<PlayingCard> getPlayingCards() {
        return playingCards;
    }


}
