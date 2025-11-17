package com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int age, membership;
    private float money;
    private ArrayList<Product> productsGot;

    public Customer(String name, int age, int membership, float money){
        this.name = name;
        this.age = age;
        this.membership = membership;
        this.money = money;
    }

    public void selectProduct(Shelf shelf, Product product){
        productsGot.add(product);
    }

    public ArrayList<Product> getAllProducts(){
        return productsGot;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getMembership(){
        return membership;
    }

    public float getMoney(){
        return money;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setMembership(int membership){
        this.membership = membership;
    }
}
