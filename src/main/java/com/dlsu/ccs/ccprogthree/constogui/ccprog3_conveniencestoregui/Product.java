package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

public class Product {
    private String name;
    protected String category;
    private String brand;
    private String variant;
    private int quantity;
    private float price;
    // Product Constructor
    public Product(String name, String category, String brand, String variant, int quantity, float price) {
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.variant = variant;
        this.quantity = quantity;
        this.price = price;
    }
    // Getter method of the product's name
    public String getName() {
        return name;
    }
    // Setter method of the product's name
    public void setName(String name) {
        this.name = name;
    }
    // Getter method of the product's category
    public String getCategory() {
        return category;
    }
    // Setter method of the product's category
    public void setCategory(String category) {
        this.category = category;
    }
    // Getter method of the product's brand
    public String getBrand() {
        return brand;
    }
    // Setter method of the product's brand
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // Getter method of the product's variant
    public String getVariant() {
        return variant;
    }
    // Setter method of the product's variant
    public void setVariant(String variant) {
        this.variant = variant;
    }
    // Getter method of the product's quantity
    public int getQuantity() {
        return quantity;
    }
    // Setter method of the product's quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // Getter method of the product's price
    public float getPrice() {
        return price;
    }
    // Setter method of the product's price
    public void setPrice(float price) {
        this.price = price;
    }
}

class Food extends Product {
    // Food Constructor
    public Food(String name, String category, String brand, String variant, int quantity, float price){
        super(name, category, brand, variant, quantity, price);
        this.category = "Food";
    }
}

class Beverages extends Product {
    // Beverages Constructor
    public Beverages(String name, String category, String brand, String variant, int quantity, float price){
        super(name, category, brand, variant, quantity, price);
        this.category = "Beverages";
    }
}

class Toiletries extends Product {
    // Toiletries Constructor
    public Toiletries(String name, String category, String brand, String variant, int quantity, float price){
        super(name, category, brand, variant, quantity, price);
        this.category = "Toiletries";
    }
}

class Cleaning_Products extends Product {
    // Cleaning Products Constructor
    public Cleaning_Products(String name, String category, String brand, String variant, int quantity, float price){
        super(name, category, brand, variant, quantity, price);
        this.category = "Cleaning_Products";
    }
}

class Medications extends Product {
    // Medications Constructor
    public Medications(String name, String category, String brand, String variant, int quantity, float price){
        super(name, category, brand, variant, quantity, price);
        this.category = "Medications";
    }
}