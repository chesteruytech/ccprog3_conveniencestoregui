package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;

public class Shelf {
    private final int shelfNumber;
    private ArrayList<Product> products;

    public Shelf(int shelfNumber){
        this.shelfNumber = shelfNumber;
    }

    public int getNumber() {
        return shelfNumber;
    }

    public ArrayList<Product> getProducts(){
        return products;
    }

    public void setProducts(ArrayList<Product> products){
        this.products = products;
    }
}
