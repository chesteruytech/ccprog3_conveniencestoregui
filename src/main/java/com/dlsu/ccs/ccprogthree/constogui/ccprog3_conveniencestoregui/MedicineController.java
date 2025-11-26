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

public class MedicineController {
    private Parent root;
    private Stage stage;
    @FXML Image cpImageOne;
    @FXML Image cpImageTwo;
    @FXML Image cpImageThree;
    @FXML Image cpImageFour;
    @FXML Image cpImageFive;
    @FXML ImageView cpProductOne = new ImageView(cpImageOne);
    @FXML ImageView cpProductTwo = new ImageView(cpImageTwo);
    @FXML ImageView cpProductThree = new ImageView(cpImageThree);
    @FXML ImageView cpProductFour = new ImageView(cpImageFour);
    @FXML ImageView cpProductFive = new ImageView(cpImageFive);

    public void initialize() {
        cpProductOne.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        cpProductTwo.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        cpProductThree.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        cpProductFour.setOnMouseClicked(click -> {
            try{root = FXMLLoader.load(getClass().getResource("ProductGUI.fxml"));}
            catch (IOException e) {throw new RuntimeException(e);}
            stage = (Stage)((Node)click.getSource()).getScene().getWindow();
            stage.setScene(new Scene (root));
            stage.show();
        });

        cpProductFive.setOnMouseClicked(click -> {
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
