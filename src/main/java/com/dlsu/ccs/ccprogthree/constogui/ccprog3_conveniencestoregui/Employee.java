package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    String name;
    private ArrayList<Product> stockInventory;
    // Employee Constructor
    public Employee(String name){
        this.name = name;
    }
    // Getter method of the name of the employee
    public String getName() {
        return name;
    }
    // Setter method to update name of the employee
    public void setName(String name) {
        this.name = name;
    }
    // Getter method to get the array list of products the Employee has
    public ArrayList<Product> getStockInventory() {
        return stockInventory;
    }
    // Setter method a given array list of products into the employee
    public void setStockInventory(ArrayList<Product> stockInventory) {
        this.stockInventory = stockInventory;
    }
    // Categorize the product from the inventory of the employee into food
    public void categorizeToFood(int index){
        Food foodHolder = new Food(stockInventory.get(index).getName(), stockInventory.get(index).getCategory(), stockInventory.get(index).getBrand(), stockInventory.get(index).getVariant(), stockInventory.get(index).getQuantity(), stockInventory.get(index).getPrice());
        stockInventory.set(index, foodHolder);
    }
    // Categorize the product from the inventory of the employee into beverages
    public void categorizeToBev(int index){
        Beverages bevHolder = new Beverages(stockInventory.get(index).getName(), stockInventory.get(index).getCategory(), stockInventory.get(index).getBrand(), stockInventory.get(index).getVariant(), stockInventory.get(index).getQuantity(), stockInventory.get(index).getPrice());
        stockInventory.set(index, bevHolder);
    }
    // Categorize the product from the inventory of the employee into toiletries
    public void categorizeToToil(int index){
        Toiletries toilHolder = new Toiletries(stockInventory.get(index).getName(), stockInventory.get(index).getCategory(), stockInventory.get(index).getBrand(), stockInventory.get(index).getVariant(), stockInventory.get(index).getQuantity(), stockInventory.get(index).getPrice());
        stockInventory.set(index, toilHolder);
    }
    // Categorize the product from the inventory of the employee into cleaning products
    public void categorizeToClean(int index){
        Cleaning_Products cleanHolder = new Cleaning_Products(stockInventory.get(index).getName(), stockInventory.get(index).getCategory(), stockInventory.get(index).getBrand(), stockInventory.get(index).getVariant(), stockInventory.get(index).getQuantity(), stockInventory.get(index).getPrice());
        stockInventory.set(index, cleanHolder);
    }
    // Categorize the product from the inventory of the employee into medications
    public void categorizeToMed(int index){
        Medications medHolder = new Medications(stockInventory.get(index).getName(), stockInventory.get(index).getCategory(), stockInventory.get(index).getBrand(), stockInventory.get(index).getVariant(), stockInventory.get(index).getQuantity(), stockInventory.get(index).getPrice());
        stockInventory.set(index, medHolder);
    }

//    public static void reStock(Shelf shelf){
//        for (Product newStock : stockInventory){
//            shelf.getProducts().add(newStock);
//        }
//
//        stockInventory.clear();
//    }
//
//    public static void reStock(Shelf shelf, int noOfProductStock){
//        for (int i = 0; i < noOfProductStock; i++) {
//            shelf.getProducts().add(stockInventory.get(i));
//        }
//
//        for (int i = 0; i < noOfProductStock; i++) {
//            stockInventory.remove(stockInventory.get(i));
//        }
//    }
}
