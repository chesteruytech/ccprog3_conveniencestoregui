package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import javafx.collections.transformation.FilteredList;
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
    private FilteredList<Product> filteredProducts;
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

    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployeeGUI.fxml"));
        root = loader.load();
        ManagementController controller = loader.getController();

        filteredProducts = new FilteredList<>(controller.getProductList(), p -> true);

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

    public void backToMain(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ShelfGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }
}
