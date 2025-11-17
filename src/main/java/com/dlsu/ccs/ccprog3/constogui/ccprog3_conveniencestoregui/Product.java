package com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;

public class Product {
    private String name;
    protected String category;
    private String brand;
    private String variant;
    private float price;
    private int quantity;

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public String getVariant() {
        return variant;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setValues(String name, String brand, String variant, int quantity, float price) {
        this.name = name;
        this.brand = brand;
        this.variant = variant;
        this.quantity = quantity;
        this.price = price;
    }
}
