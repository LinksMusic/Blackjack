package com.example.blackjack.datatypes;
import com.example.blackjack.datatypes.enums.Rank;
import com.example.blackjack.datatypes.enums.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
    private final List<Card> cards;

    public Deck(){
        //Initialize Arraylist of all cards in order
        this.cards = new ArrayList<>();
        for(Suit suit: Suit.values()){
            for(Rank rank: Rank.values()){
                cards.add(new Card(rank,suit));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }


}
