package com.example.blackjack;

import com.example.blackjack.datatypes.Card;
import com.example.blackjack.datatypes.Deck;
import com.example.blackjack.datatypes.Player;
import com.example.blackjack.datatypes.enums.Chip;
import com.example.blackjack.management.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //stage.setTitle("Hello!");
        //stage.setScene(scene);
        //stage.show();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),320,240);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //launch();
        ArrayList<Chip> balance = new ArrayList<>();
        balance.add(Chip.ONE);
        balance.add(Chip.FIVE);
        Player player = new Player(balance);
        Game.getInstance(player);
        Game.hit();
        Game.hit();
        Game.hit();
        Game.hit();

    }
}