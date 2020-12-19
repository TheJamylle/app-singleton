package app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.MainScene;

/**
 *
 * @author Jamylle
 */
public class App extends Application {
    private Stage stage;
    
    @Override
    public void start(Stage stage) {
        this.stage = stage;
        var label = new Label("Fellow");
        
        StackPane root = new StackPane();
        
        Scene scene = new MainScene(this);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void setScene(Scene scene) {
        stage.setScene(scene);
    }
}
