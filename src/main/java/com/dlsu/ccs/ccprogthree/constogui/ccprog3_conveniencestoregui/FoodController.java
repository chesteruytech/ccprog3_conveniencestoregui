package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodController {
    private Parent root;
    private Stage stage;
    @FXML Image foodImageOne;
    @FXML Image foodImageTwo;
    @FXML Image foodImageThree;
    @FXML Image foodImageFour;
    @FXML Image foodImageFive;
    @FXML ImageView foodProductOne = new ImageView(foodImageOne);
    @FXML ImageView foodProductTwo = new ImageView(foodImageTwo);
    @FXML ImageView foodProductThree = new ImageView(foodImageThree);
    @FXML ImageView foodProductFour = new ImageView(foodImageFour);
    @FXML ImageView foodProductFive = new ImageView(foodImageFive);

    public void initialize() {
        foodProductOne.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        foodProductTwo.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        foodProductThree.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        foodProductFour.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        foodProductFive.setOnMouseClicked(click -> {
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
