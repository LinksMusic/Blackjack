package com.example.blackjack.datatypes;

import com.example.blackjack.datatypes.enums.Rank;
import com.example.blackjack.datatypes.enums.Suit;

public class Card {

    private Rank rank;
    private Suit suit;
    private boolean shown;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public boolean isShown() {
        return shown;
    }

    public void setShown(boolean shown) {
        this.shown = shown;
    }
}
