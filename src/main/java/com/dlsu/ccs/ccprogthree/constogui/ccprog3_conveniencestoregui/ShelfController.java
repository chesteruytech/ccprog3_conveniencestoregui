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
    private final ManagementController managementController = new ManagementController();
    private final FilteredList<Product> filteredProducts = new FilteredList<>(managementController.getProductList());
    @FXML Button foodButton;
    @FXML Button beveragesButton;
    @FXML Button toiletriesButton;
    @FXML Button cleaningProductsButton;
    @FXML Button medicineButton;

    private void filterByCategory(String category) {
        Predicate<Product> filter = product -> product.getCategory().equals(category);
        filteredProducts.setPredicate(filter);
    }

    // Customer Button; open to everyone
    public void food(ActionEvent event) throws IOException {
        filterByCategory("Food");
        root = FXMLLoader.load(getClass().getResource("FoodGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    // Employee Button; restricted to employees
    public void beverages(ActionEvent event) throws IOException {
        filterByCategory("Beverages");
        root = FXMLLoader.load(getClass().getResource("BeveragesGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    // Closes the application
    public void toiletries(ActionEvent event) throws IOException {
        filterByCategory("Toiletries");
        root = FXMLLoader.load(getClass().getResource("ToiletriesGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    // Customer Button; open to everyone
    public void cleaningProducts(ActionEvent event) throws IOException {
        filterByCategory("Cleaning");
        root = FXMLLoader.load(getClass().getResource("CleaningProductsGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    // Employee Button; restricted to employees
    public void medicine(ActionEvent event) throws IOException {
        filterByCategory("Medicine");
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
}
