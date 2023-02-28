package com.example.blackjack.controller;

import com.example.blackjack.datatypes.Player;
import com.example.blackjack.datatypes.enums.Chip;
import com.example.blackjack.management.Game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LoginController {

    @FXML
    private Label balanceLabel;

    @FXML
    private ImageView fiveValueChipImageView;

    @FXML
    private ImageView oneValueChipImageView;

    @FXML
    private Button startGameButton;

    @FXML
    private ImageView twoValueChipImageView;

    @FXML
    private TextField nameTextField;

    private ArrayList<Chip> initialBalance = new ArrayList<>();

    @FXML
    void handleFive(MouseEvent event) {
        int balanceBefore;
        balanceBefore = Integer.parseInt(balanceLabel.getText());
        if (event.getButton() == MouseButton.PRIMARY)
        {
            initialBalance.add(Chip.FIVE);
            balanceLabel.setText(Integer.toString(balanceBefore+5));
        } else if (event.getButton() == MouseButton.SECONDARY)
        {
            if (balanceBefore-5 >= 0){
                balanceLabel.setText(Integer.toString(balanceBefore-5));
                initialBalance.remove(Chip.FIVE);
            }

        }
    }

    @FXML
    void handleOne(MouseEvent event) {
        int balanceBefore;
        balanceBefore = Integer.parseInt(balanceLabel.getText());
        if (event.getButton() == MouseButton.PRIMARY)
        {
            initialBalance.add(Chip.ONE);
            balanceLabel.setText(Integer.toString(balanceBefore+1));
        } else if (event.getButton() == MouseButton.SECONDARY)
        {
            if (balanceBefore-1 >= 0){
                balanceLabel.setText(Integer.toString(balanceBefore-1));
                initialBalance.remove(Chip.ONE);
            }
        }
    }

    @FXML
    void handleTwo(MouseEvent event) {
        int balanceBefore;
        balanceBefore = Integer.parseInt(balanceLabel.getText());
        if (event.getButton() == MouseButton.PRIMARY)
        {
            initialBalance.add(Chip.TWO);
            balanceLabel.setText(Integer.toString(balanceBefore+2));
        } else if (event.getButton() == MouseButton.SECONDARY)
        {
            if (balanceBefore-2 >= 0){
                balanceLabel.setText(Integer.toString(balanceBefore-2));
                initialBalance.remove(Chip.TWO);
            }
        }
    }

    @FXML
    void startGame(ActionEvent event) {
        Game.getInstance(new Player(initialBalance));
    }

}
