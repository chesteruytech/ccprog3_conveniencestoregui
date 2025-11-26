package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.net.URL;
import java.util.*;
import javafx.collections.*;
import javafx.fxml.*;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

public class ManagementController implements Initializable {
    @FXML private TableView<Product> editableProductTable;
    @FXML private TableColumn<Product, String> nameColumn;
    @FXML private TableColumn<Product, String> categoryColumn;
    @FXML private TableColumn<Product, String> brandColumn;
    @FXML private TableColumn<Product, String> variantColumn;
    @FXML private TableColumn<Product, Integer> quantityColumn;
    @FXML private TableColumn<Product, Float> priceColumn;

    // initializes the list of products
//    ObservableList<Product> productList = FXCollections.observableArrayList(
//            new Product("C2Yellow", "Beverages", "C2", "Yellow", 10, 26.50f),
//            new Product("CokeRegular", "Beverages", "Coke", "Regular", 10, 28.50f),
//            new Product("CokeZero", "Beverages", "Coke", "Zero", 10, 28.50f),
//            new Product("RoyalClassic", "Beverages", "Royal", "Classic", 10, 27.25f),
//            new Product("ColgateTripleAction", "Toiletries", "Colgate", "TripleAction", 10, 76.50f),
//            new Product("ColgateAntiCavity", "Toiletries", "Colgate", "AntiCavity", 10, 76.50f),
//            new Product("SafeguardPureWhite", "Toiletries", "Safeguard", "PureWhite", 10, 50.25f),
//            new Product("SafeguardLemon", "Toiletries", "Safeguard", "Lemon", 10, 50.25f),
//            new Product("OldSpiceOriginal", "Toiletries", "OldSpice", "Original", 10, 243.00f),
//            new Product("GreenCrossAlcoholClassic", "Cleaning", "GreenCross", "AlcoholClassic", 10, 65.75f),
//            new Product("TideDetergent", "Cleaning", "Tide", "Detergent", 10, 262.50f),
//            new Product("TideBar", "Cleaning", "Tide", "Bar", 10, 14.70f),
//            new Product("ScotchBriteYellow", "Cleaning", "ScotchBrite", "Yellow", 10, 71.50f),
//            new Product("ScotchBriteBlue", "Cleaning", "ScotchBrite", "Blue", 10, 71.50f),
//            new Product("TempraForte", "Medicine", "Tempra", "Forte", 10, 12.50f),
//            new Product("SolmuxCapsule", "Medicine", "Solmux", "Capsule", 10, 11.25f),
//            new Product("DolfenalTablet", "Medicine", "Dolfenal", "Tablet", 10, 15.00f),
//            new Product("DecolgenNonDrowsy", "Medicine", "Decolgen", "NonDrowsyTablet", 10, 13.15f),
//            new Product("Trimox", "Medicine", "Trimox", "Tablet", 10, 28.35f)
//    );

    public ObservableList<Product> getProductList(){
        ObservableList<Product> productList = FXCollections.observableArrayList();
        productList.add(new Product("CLoud9Classic", "Food","Cloud9", "Classic", 10, 10.55f));
        productList.add(new Product("VcutBarbeque", "Food", "Vcut", "Barbeque", 10, 18.70f));
        productList.add(new Product("VcutCheese", "Food", "Vcut", "Cheese", 10, 18.70f));
        productList.add(new Product("PiattosSourCream", "Food", "Piattos", "SourCream", 10, 16.31f));
        productList.add(new Product("PiattosCheese", "Food", "Piattos", "Cheese", 10, 16.31f));
        productList.add(new Product("C2Red", "Beverages", "C2", "Red", 10, 26.50f));
        productList.add(new Product("C2Yellow", "Beverages", "C2", "Yellow", 10, 26.50f));
        productList.add(new Product("CokeRegular", "Beverages", "Coke", "Regular", 10, 28.50f));
        productList.add(new Product("CokeZero", "Beverages", "Coke", "Zero", 10, 28.50f));
        productList.add(new Product("RoyalClassic", "Beverages", "Royal", "Classic", 10, 27.25f));
        productList.add(new Product("ColgateTripleAction", "Toiletries", "Colgate", "TripleAction", 10, 76.50f));
        productList.add(new Product("ColgateAntiCavity", "Toiletries", "Colgate", "AntiCavity", 10, 76.50f));
        productList.add(new Product("SafeguardPureWhite", "Toiletries", "Safeguard", "PureWhite", 10, 50.25f));
        productList.add(new Product("SafeguardLemon", "Toiletries", "Safeguard", "Lemon", 10, 50.25f));
        productList.add(new Product("OldSpiceOriginal", "Toiletries", "OldSpice", "Original", 10, 243.00f));
        productList.add(new Product("GreenCrossAlcoholClassic", "Cleaning", "GreenCross", "AlcoholClassic", 10, 65.75f));
        productList.add(new Product("TideDetergent", "Cleaning", "Tide", "Detergent", 10, 262.50f));
        productList.add(new Product("TideBar", "Cleaning", "Tide", "Bar", 10, 14.70f));
        productList.add(new Product("ScotchBriteYellow", "Cleaning", "ScotchBrite", "Yellow", 10, 71.50f));
        productList.add(new Product("ScotchBriteBlue", "Cleaning", "ScotchBrite", "Blue", 10, 71.50f));
        productList.add(new Product("TempraForte", "Medicine", "Tempra", "Forte", 10, 12.50f));
        productList.add(new Product("SolmuxCapsule", "Medicine", "Solmux", "Capsule", 10, 11.25f));
        productList.add(new Product("DolfenalTablet", "Medicine", "Dolfenal", "Tablet", 10, 15.00f));
        productList.add(new Product("DecolgenNonDrowsy", "Medicine", "Decolgen", "NonDrowsyTablet", 10, 13.15f));
        productList.add(new Product("Trimox", "Medicine", "Trimox", "Tablet", 10, 28.35f));

        return productList;
    }

    // Add button
    public void add(){
        Product product = new Product(nameColumn.getText(), categoryColumn.getText(), brandColumn.getText(),
                variantColumn.getText(), Integer.parseInt(quantityColumn.getText()),
                Float.parseFloat(priceColumn.getText()));

        Dialog<Product> addDialog = new Dialog<>();
        addDialog.setTitle("Add Product");
        addDialog.setHeaderText("Please enter the required product details");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10,10));

        TextField productName = new TextField();
        productName.setPromptText("Name");
        TextField productCategory = new TextField();
        productCategory.setPromptText("Category");
        TextField productBrand = new TextField();
        productBrand.setPromptText("Brand");
        TextField productVariant = new TextField();
        productVariant.setPromptText("Variant");
        TextField productQuantity = new TextField();
        productQuantity.setPromptText("Quantity");
        TextField productPrice = new TextField();
        productPrice.setPromptText("Price");

        grid.add(new Label("Name:"), 0, 0);
        grid.add(productName, 1,0);
        grid.add(new Label("Category"), 0, 1);
        grid.add(productName, 1,1);
        grid.add(new Label("Brand"), 0, 2);
        grid.add(productName, 1,2);
        grid.add(new Label("Variant"), 0, 3);
        grid.add(productName, 1,3);
        grid.add(new Label("Quantity"), 0, 4);
        grid.add(productName, 1,4);
        grid.add(new Label("Price"), 0, 5);
        grid.add(productName, 1,5);

        ButtonType addButtonType = new ButtonType("Add", ButtonBar.ButtonData.OK_DONE);
        addDialog.getDialogPane().getButtonTypes().addAll(addButtonType, ButtonType.CANCEL);

        addDialog.getDialogPane().setContent(grid);

        addDialog.setResultConverter(dialogButton -> {
            if (dialogButton == addButtonType) {
                return new Product(productName.getText(), productCategory.getText(), productBrand.getText(), productVariant.getText(), Integer.parseInt(productQuantity.getText()), Float.parseFloat(productPrice.getText()));
            } return null;
        });

        ObservableList<Product> products = editableProductTable.getItems();
        products.add(product);
        editableProductTable.setItems(products);
    }

    public void modifyNameEvent() {
        Product productSelected = editableProductTable.getSelectionModel().getSelectedItem();

        TextInputDialog modifyNameDialog = new TextInputDialog();
        modifyNameDialog.setTitle("Change Name");
        modifyNameDialog.setHeaderText("Please enter new product name you would like to change");
        modifyNameDialog.setContentText("Name:");

        Optional<String> nameResult = modifyNameDialog.showAndWait();

        nameResult.ifPresent(productSelected::setName);
    }

    public void modifyCategoryEvent() {
        Product productSelected = editableProductTable.getSelectionModel().getSelectedItem();

        TextInputDialog modifyCategoryDialog = new TextInputDialog();
        modifyCategoryDialog.setTitle("Change Category");
        modifyCategoryDialog.setHeaderText("Please enter new product category you would like to change");
        modifyCategoryDialog.setContentText("Category:");

        Optional<String> categoryResult = modifyCategoryDialog.showAndWait();

        categoryResult.ifPresent(productSelected::setCategory);
    }

    public void modifyBrandEvent() {
        Product productSelected = editableProductTable.getSelectionModel().getSelectedItem();

        TextInputDialog modifyBrandDialog = new TextInputDialog();
        modifyBrandDialog.setTitle("Change Brand");
        modifyBrandDialog.setHeaderText("Please enter new product brand you would like to change");
        modifyBrandDialog.setContentText("Brand:");

        Optional<String> brandResult = modifyBrandDialog.showAndWait();

        brandResult.ifPresent(productSelected::setBrand);
    }

    public void modifyVariantEvent() {
        Product productSelected = editableProductTable.getSelectionModel().getSelectedItem();

        TextInputDialog modifyVariantDialog = new TextInputDialog();
        modifyVariantDialog.setTitle("Change Variant");
        modifyVariantDialog.setHeaderText("Please enter new product variant you would like to change");
        modifyVariantDialog.setContentText("Variant:");

        Optional<String> variantResult = modifyVariantDialog.showAndWait();

        variantResult.ifPresent(productSelected::setVariant);
    }

    public void modifyStockEvent() {
        Product productSelected = editableProductTable.getSelectionModel().getSelectedItem();

        TextInputDialog modifyQuantityDialog = new TextInputDialog();
        modifyQuantityDialog.setTitle("Change Stock");
        modifyQuantityDialog.setHeaderText("Update product stock you would like to change");
        modifyQuantityDialog.setContentText("Stock:");

        Optional<String> stockResult = modifyQuantityDialog.showAndWait();

        stockResult.ifPresent(s -> productSelected.setQuantity(Integer.parseInt(s)));
    }

    public void modifyPriceEvent() {
        Product productSelected = editableProductTable.getSelectionModel().getSelectedItem();

        TextInputDialog modifyPriceDialog = new TextInputDialog();
        modifyPriceDialog.setTitle("Change Price");
        modifyPriceDialog.setHeaderText("Update product price you would like to change");
        modifyPriceDialog.setContentText("Price:");

        Optional<String> priceResult = modifyPriceDialog.showAndWait();

        priceResult.ifPresent(s -> productSelected.setPrice(Float.parseFloat(s)));
    }

    // Modify button and pick a choice where value should be modified
    public void modify() {
        ChoiceDialog<String> dialog = new ChoiceDialog<>("Name", "Category", "Brand", "Variant", "Stock", "Price");
        dialog.setTitle("Modify Product");
        dialog.setHeaderText("Select an Option to Modify a Value of the Product");
        dialog.setContentText("Value:");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent((item)->{
            ManagementController controller = new ManagementController();

            switch(item){
                case "Name":
                    controller.modifyNameEvent();
                    break;
                case "Category":
                    controller.modifyCategoryEvent();
                    break;
                case "Brand":
                    controller.modifyBrandEvent();
                    break;
                case "Variant":
                    controller.modifyVariantEvent();
                    break;
                case "Stock":
                    controller.modifyStockEvent();
                    break;
                case "Price":
                    controller.modifyPriceEvent();
                    break;
            }
        });
    }

    // Select an existing product then remove from the table
    public void remove() {
        int selectedProduct = editableProductTable.getSelectionModel().getSelectedIndex();
        editableProductTable.getItems().remove(selectedProduct);
    }

    // Initializes the table data into the array
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        brandColumn.setCellValueFactory(new PropertyValueFactory<>("brand"));
        variantColumn.setCellValueFactory(new PropertyValueFactory<>("variant"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        editableProductTable.setItems(getProductList());
    }

    public void displayName(String username){
        Label employeeNameLabel = new Label(username);
        employeeNameLabel.setText("Welcome back to U&P, " + username + "!");
    }
}