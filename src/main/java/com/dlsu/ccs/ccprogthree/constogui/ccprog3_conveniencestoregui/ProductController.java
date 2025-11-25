package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProductController implements Initializable {
    @FXML
    private TableView<Product> editableProductTable;
    @FXML
    private TableColumn<Product, String> name;
    @FXML
    private TableColumn<Product, String> category;
    @FXML
    private TableColumn<Product, String> brand;
    @FXML
    private TableColumn<Product, String> variant;
    @FXML
    private TableColumn<Product, Integer> quantity;
    @FXML
    private TableColumn<Product, Float> price;

    ObservableList<Product> productList = FXCollections.observableArrayList(
            new Product("CLoud9Classic", "Food","Cloud9", "Classic", 10, 10.55f),
            new Product("VcutBarbeque", "Food", "Vcut", "Barbeque", 10, 18.70f),
            new Product("VcutCheese", "Food", "Vcut", "Cheese", 10, 18.70f),
            new Product("PiattosSourCream", "Food", "Piattos", "SourCream", 10, 16.31f),
            new Product("PiattosCheese", "Food", "Piattos", "Cheese", 10, 16.31f),
            new Product("C2Red", "Beverages", "C2", "Red", 10, 26.50f),
            new Product("C2Yellow", "Beverages", "C2", "Yellow", 10, 26.50f),
            new Product("CokeRegular", "Beverages", "Coke", "Regular", 10, 28.50f),
            new Product("CokeZero", "Beverages", "Coke", "Zero", 10, 28.50f),
            new Product("RoyalClassic", "Beverages", "Royal", "Classic", 10, 27.25f),
            new Product("ColgateTripleAction", "Toiletries", "Colgate", "TripleAction", 10, 76.50f),
            new Product("ColgateAntiCavity", "Toiletries", "Colgate", "AntiCavity", 10, 76.50f),
            new Product("SafeguardPureWhite", "Toiletries", "Safeguard", "PureWhite", 10, 50.25f),
            new Product("SafeguardLemon", "Toiletries", "Safeguard", "Lemon", 10, 50.25f),
            new Product("OldSpiceOriginal", "Toiletries", "OldSpice", "Original", 10, 243.00f),
            new Product("GreenCrossAlcoholClassic", "Cleaning", "GreenCross", "AlcoholClassic", 10, 65.75f),
            new Product("TideDetergent", "Cleaning", "Tide", "Detergent", 10, 262.50f),
            new Product("TideBar", "Cleaning", "Tide", "Bar", 10, 14.70f),
            new Product("ScotchBriteYellow", "Cleaning", "ScotchBrite", "Yellow", 10, 71.50f),
            new Product("ScotchBriteBlue", "Cleaning", "ScotchBrite", "Blue", 10, 71.50f),
            new Product("TempraForte", "Medicine", "Tempra", "Forte", 10, 12.50f),
            new Product("SolmuxCapsule", "Medicine", "Solmux", "Capsule", 10, 11.25f),
            new Product("DolfenalTablet", "Medicine", "Dolfenal", "Tablet", 10, 15.00f),
            new Product("DecolgenNonDrowsy", "Medicine", "Decolgen", "NonDrowsyTablet", 10, 13.15f),
            new Product("Trimox", "Medicine", "Trimox", "Tablet", 10, 28.35f)
    );

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        category.setCellValueFactory(new PropertyValueFactory<>("Category"));
        brand.setCellValueFactory(new PropertyValueFactory<>("Brand"));
        variant.setCellValueFactory(new PropertyValueFactory<>("Variant"));
        quantity.setCellValueFactory(new PropertyValueFactory<>("Stock"));
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));

        editableProductTable.setItems(productList);
    }
}
