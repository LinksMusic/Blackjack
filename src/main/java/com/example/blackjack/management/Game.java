package com.example.blackjack.management;

import com.example.blackjack.datatypes.Card;
import com.example.blackjack.datatypes.Deck;
import com.example.blackjack.datatypes.Player;
import com.example.blackjack.datatypes.enums.Chip;
import com.example.blackjack.datatypes.enums.Rank;
import com.example.blackjack.datatypes.enums.Suit;

import java.util.ArrayList;

public class Game {
    private static Game instance = null;
    private static final Deck deck = new Deck();
    private static Player player;
    private Game(Player player){
        Game.player = player;
        deck.shuffleDeck();
    }

    public static void getInstance(Player player) {
        if (instance == null) {
            instance = new Game(player);
        }
    }

    public static void hit(){
        Card card = deck.getFirstCard();
        deck.removeFirstCard();
        player.addCardToHand(card);
        if (isOver()){

        }
    }

    public static boolean isOver(){
        ArrayList<Card> playerHand = player.getHand();
        int values=0;
        boolean over = false;
        int i=0;
        Rank rank;
        while(!over){
            rank = playerHand.get(i).getRank();
            switch(rank){
                case ACEONE:
                    values += 1;
                    break;
                case ACEELEVEN:
                    values += 11;
                    break;
                case TWO:
                    values +=2;
                    break;
                case THREE:
                    values +=3;
                    break;
                case FOUR:
                    values +=4;
                    break;
                case FIVE:
                    values +=5;
                    break;
                case SIX:
                    values +=6;
                    break;
                case SEVEN:
                    values +=7;
                    break;
                case EIGHT:
                    values +=8;
                    break;
                case NINE:
                    values +=9;
                    break;
                case TEN:
                    values +=10;
                    break;
                case JACK:
                    values +=10;
                    break;
                case QUEEN:
                    values +=10;
                    break;
                case KING:
                    values +=10;
                    break;
            }
            if (values > 21){
                over = true;
            }
        }
        return over;
    }

}
