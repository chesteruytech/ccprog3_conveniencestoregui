package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;

public class Shelf {
    private final int shelfNumber;
    private ArrayList<Product> products;
    // Shelf Constructor
    public Shelf(int shelfNumber){
        this.shelfNumber = shelfNumber;
    }
    // Getter method of the shelf's number
    public int getNumber() {
        return shelfNumber;
    }
    // Getter method of the current products in the shelf
    public ArrayList<Product> getProducts(){
        return products;
    }
    // Setter method of adding products inside the shelf
    public void setProducts(ArrayList<Product> products){
        this.products = products;
    }
}
