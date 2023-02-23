package com.example.blackjack.datatypes;

import com.example.blackjack.datatypes.enums.Chip;

import java.util.ArrayList;

public class Player {
    private String name;
    private int points;
    private ArrayList<Chip> balance;
    private ArrayList<Card> hand;
    private ArrayList<Chip> bet;
    private String status;

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

}
