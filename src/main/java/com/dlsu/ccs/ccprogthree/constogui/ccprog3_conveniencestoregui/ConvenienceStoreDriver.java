package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;

public class ConvenienceStoreDriver extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("U&P's Convenience Store");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    static void main(String[] args) {
        launch(args);
    }
}
