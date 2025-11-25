package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import javafx.application.Application;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;

import java.awt.*;

public class ConvenienceStoreDriver extends Application {
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Convenience Store GUI");

        button = new Button("Click Me");
    }
}
