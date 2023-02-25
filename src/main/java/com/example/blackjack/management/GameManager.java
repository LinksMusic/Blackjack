package com.example.blackjack.management;

import com.example.blackjack.datatypes.Player;
import com.example.blackjack.datatypes.enums.Chip;

public class GameManager {
    private final int startingBalance;

    private final Player player;
    public GameManager(int startingBalance){
        this.startingBalance = startingBalance;
        this.player = new Player(Chip.convert(startingBalance));
    }
}
