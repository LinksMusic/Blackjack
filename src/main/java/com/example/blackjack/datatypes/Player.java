package com.example.blackjack.datatypes;

import com.example.blackjack.datatypes.enums.Chip;

import java.util.ArrayList;

public class Player {
    private int points;
    private ArrayList<Chip> balance;
    private ArrayList<Card> hand = new ArrayList<>();
    private ArrayList<Chip> bet = new ArrayList<>();
    private final Deck deck = new Deck();

    public Player(ArrayList<Chip> balance){
        this.balance = balance;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addCardToHand(Card card){
        hand.add(card);
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }

}
