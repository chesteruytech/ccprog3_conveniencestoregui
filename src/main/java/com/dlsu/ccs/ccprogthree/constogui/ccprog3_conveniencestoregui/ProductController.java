package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

public class ProductController {
    private Product model;

    public ProductController(Product model, ProductView view){
        this.model = model;
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
        ProductView.showProductInformation(model.getName(), model.getCategory(), model.getBrand(), model.getVariant(),
                model.getQuantity(), model.getPrice());
    }
}
