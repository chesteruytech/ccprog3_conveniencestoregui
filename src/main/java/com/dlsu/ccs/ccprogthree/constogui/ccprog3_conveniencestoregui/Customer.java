package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int age;
    private boolean membership;
    private final float money;
    private ArrayList<Product> productsGot;
    // Customer Constructor
    public Customer(String name, int age, boolean membership, float money){
        this.name = name;
        this.age = age;
        this.membership = membership;
        this.money = money;
    }
    // Gets a product from the current shelf picked
    public void selectProduct(Shelf shelf, Product product){
        productsGot.add(product);
    }
    // Getter method of the products the customer got
    public ArrayList<Product> getAllProducts(){
        return productsGot;
    }
    // Getter method of the customer's name
    public String getName(){
        return name;
    }
    // Getter method of the customer's age
    public int getAge(){
        return age;
    }
    // Getter method of the customer's membership
    public boolean getMembership(){
        return membership;
    }
    // Getter method of the current balance of the customer
    public float getMoney(){
        return money;
    }
    // Setter method of updating the customer's name
    public void setName(String name){
        this.name = name;
    }
    // Setter method of updating the customer's age
    public void setAge(int age){
        this.age = age;
    }
    // Setter method of updating the customer's membership
    public void setMembership(boolean membership){
        this.membership = membership;
    }
}
