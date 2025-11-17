package com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;

public class ProductController {
    private Product model;
    private ProductView view;

    public ProductController(Product model, ProductView view){
        this.model = model;
        this.view = view;
    }

    public String getProductName() {
        return model.getName();
    }

    public String getProductCategory() {
        return model.getCategory();
    }

    public String getProductBrand() {
        return model.getBrand();
    }

    public String getProductVariant() {
        return model.getVariant();
    }

    public int getProductQuantity() {
        return model.getQuantity();
    }

    public float getProductPrice() {
        return model.getPrice();
    }

    public void setProductValues(String name, String brand, String variant, int quantity, float price) {
        model.setValues(name, brand, variant, quantity, price);
    }

    public void updateProductView() {
        view.showProductInformation(model.getName(),  model.getCategory(), model.getBrand(), model.getVariant(),
                model.getQuantity(), model.getPrice());
    }
}
