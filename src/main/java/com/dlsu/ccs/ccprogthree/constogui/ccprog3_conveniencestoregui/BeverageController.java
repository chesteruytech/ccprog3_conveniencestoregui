package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.stage.Stage;

public class BeverageController {
    private Parent root;
    private Stage stage;
    @FXML Image bevImageOne;
    @FXML Image bevImageTwo;
    @FXML Image bevImageThree;
    @FXML Image bevImageFour;
    @FXML Image bevImageFive;
    @FXML ImageView bevProductOne = new ImageView(bevImageOne);
    @FXML ImageView bevProductTwo = new ImageView(bevImageTwo);
    @FXML ImageView bevProductThree = new ImageView(bevImageThree);
    @FXML ImageView bevProductFour = new ImageView(bevImageFour);
    @FXML ImageView bevProductFive = new ImageView(bevImageFive);

    public void initialize() {
        bevProductOne.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        bevProductTwo.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        bevProductThree.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        bevProductFour.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        bevProductFive.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });
    }

    public void previousStage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ShelfGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }
}
