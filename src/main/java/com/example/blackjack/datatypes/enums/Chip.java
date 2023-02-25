package com.example.blackjack.datatypes.enums;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public enum Chip {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100),
    TWOHUNDRED(200),
    FIVEHUNDRED(500);

    private final int value;

    Chip(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ArrayList<Chip> convert(int value) {
        ArrayList<Chip> out = new ArrayList<>();
        for (Chip chip : Chip.values()) {
            while (value >= chip.getValue()) {
                out.add(chip);
                value -= chip.getValue();
            }
        }
        return out;
    }
}
