package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.io.IOException;
import java.util.function.Predicate;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.image.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ShelfController {
    private Parent root;
    private Stage stage;
    private FilteredList<Product> filteredProducts;
    @FXML Button foodButton;
    @FXML Button beveragesButton;
    @FXML Button toiletriesButton;
    @FXML Button cleaningProductsButton;
    @FXML Button medicineButton;
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

    // Customer Button; open to everyone
    public void food(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("FoodGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    // Employee Button; restricted to employees
    public void beverages(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("BeveragesGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    // Closes the application
    public void toiletries(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ToiletriesGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    // Customer Button; open to everyone
    public void cleaningProducts(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("CleaningProductsGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    // Employee Button; restricted to employees
    public void medicine(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MedicineGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    public void backToMain(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    private void filterByCategory(String category) {
        Predicate<Product> filter = product -> product.getCategory().equals(category);
        filteredProducts.setPredicate(filter);
    }

    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployeeGUI.fxml"));
        root = loader.load();
        ManagementController controller = loader.getController();

        filteredProducts = new FilteredList<>(controller.getProductList(), p -> true);

        foodButton.setOnAction(event -> {
            filterByCategory("Food");

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
        });

        beveragesButton.setOnAction(event -> {
            filterByCategory("Beverages");
        });

        toiletriesButton.setOnAction(event -> {
            filterByCategory("Toiletries");
        });

        cleaningProductsButton.setOnAction(event -> {
            filterByCategory("CleaningProducts");
        });

        medicineButton.setOnAction(event -> {
            filterByCategory("Medicine");
        });
    }
}
