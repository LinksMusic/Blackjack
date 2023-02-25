package com.example.blackjack.datatypes;

import com.example.blackjack.datatypes.enums.Chip;

import java.util.ArrayList;

public class Player {
    private String name;
    private int points;
    private ArrayList<Chip> balance;
    private ArrayList<Card> hand = new ArrayList<>();
    private ArrayList<Chip> bet = new ArrayList<>();
    private final Deck deck = new Deck();

    public Player(String name, ArrayList<Chip> balance){
        this.name = name;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void hit(){
        deck.shuffleDeck();
        hand.add(deck.getCard());
        isMoveValid();
    }

    public void stand(){
    }

    private boolean isMoveValid(){
        boolean valid = true;
        for(Card c: hand){
            System.out.println(c.getRank());
        }
        return valid;
    }

}
