package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

public class Product {
    private String name;
    protected String category;
    private String brand;
    private String variant;
    private float price;
    private int quantity;

    public Product(String name, String category, String brand, String variant, int quantity, float price) {
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.variant = variant;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

class Food extends Product {
    public Food(String name, String category, String brand, String variant, int quantity, float price){
        super(name, category, brand, variant, quantity, price);
        this.category = "Food";
    }
}

class Beverages extends Product {
    public Beverages(String name, String category, String brand, String variant, int quantity, float price){
        super(name, category, brand, variant, quantity, price);
        this.category = "Beverages";
    }
}

class Toiletries extends Product {
    public Toiletries(String name, String category, String brand, String variant, int quantity, float price){
        super(name, category, brand, variant, quantity, price);
        this.category = "Toiletries";
    }
}

class Cleaning_Products extends Product {
    public Cleaning_Products(String name, String category, String brand, String variant, int quantity, float price){
        super(name, category, brand, variant, quantity, price);
        this.category = "Cleaning_Products";
    }
}

class Medications extends Product {
    public Medications(String name, String category, String brand, String variant, int quantity, float price){
        super(name, category, brand, variant, quantity, price);
        this.category = "Medications";
    }
}