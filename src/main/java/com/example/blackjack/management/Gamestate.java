package com.example.blackjack.management;

import com.example.blackjack.datatypes.Card;

import java.util.ArrayList;

public class Gamestate {
    private ArrayList<Card> playerHand;
    private ArrayList<Card> dealerHand;
    private boolean isOver;

    private boolean playerTurn;
    public Gamestate(ArrayList<Card> playerHand, ArrayList<Card> dealerHand, boolean isOver, boolean playerTurn){

        this.playerHand = playerHand;
        this.dealerHand = dealerHand;
        this.isOver = isOver;
        this.playerTurn = playerTurn;
    }

    public void setPlayerHand(Card card) {
        playerHand.add(card);
    }

    public void setDealerHand(Card card) {
        dealerHand.add(card);
    }

    public void setIsOver(boolean over){
        this.isOver = over;
    }

    public void setPlayerTurn(boolean playerTurn){
        this.playerTurn = playerTurn;
    }
}
