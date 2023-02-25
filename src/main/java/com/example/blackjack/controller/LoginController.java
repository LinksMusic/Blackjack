package com.example.blackjack.controller;

import com.example.blackjack.management.Game;
import com.example.blackjack.management.GameManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

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
    void handleFive(MouseEvent event) {
        int balanceBefore;
        balanceBefore = Integer.parseInt(balanceLabel.getText());
        if (event.getButton() == MouseButton.PRIMARY)
        {
            balanceLabel.setText(Integer.toString(balanceBefore+5));
        } else if (event.getButton() == MouseButton.SECONDARY)
        {
            if (balanceBefore-5 >= 0){
                balanceLabel.setText(Integer.toString(balanceBefore-5));
            }

        }
    }

    @FXML
    void handleOne(MouseEvent event) {
        int balanceBefore;
        balanceBefore = Integer.parseInt(balanceLabel.getText());
        if (event.getButton() == MouseButton.PRIMARY)
        {
            balanceLabel.setText(Integer.toString(balanceBefore+1));
        } else if (event.getButton() == MouseButton.SECONDARY)
        {
            if (balanceBefore-1 >= 0){
                balanceLabel.setText(Integer.toString(balanceBefore-1));
            }
        }
    }

    @FXML
    void handleTwo(MouseEvent event) {
        int balanceBefore;
        balanceBefore = Integer.parseInt(balanceLabel.getText());
        if (event.getButton() == MouseButton.PRIMARY)
        {
            balanceLabel.setText(Integer.toString(balanceBefore+2));
        } else if (event.getButton() == MouseButton.SECONDARY)
        {
            if (balanceBefore-2 >= 0){
                balanceLabel.setText(Integer.toString(balanceBefore-2));
            }
        }
    }

    @FXML
    void startGame(ActionEvent event) {
        GameManager game = new GameManager(Integer.parseInt(balanceLabel.getText()));
    }

}
