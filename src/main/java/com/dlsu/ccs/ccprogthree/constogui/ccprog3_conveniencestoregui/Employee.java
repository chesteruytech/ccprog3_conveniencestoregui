package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    String name;
    private ArrayList<Product> stockInventory;

    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getStockInventory() {
        return stockInventory;
    }

    public void setStockInventory(ArrayList<Product> stockInventory) {
        this.stockInventory = stockInventory;
    }

    public static void addProduct(){
        Scanner createProduct = new Scanner(System.in);

        System.out.print("Product name: ");
        String productName = createProduct.nextLine();
        System.out.print("Category: ");
        String productCategory = createProduct.nextLine();
        System.out.print("Brand: ");
        String productBrand = createProduct.nextLine();
        System.out.print("Variant: ");
        String productVariant = createProduct.nextLine();
        System.out.print("Quantity: ");
        int productQuantity = createProduct.nextInt();
        System.out.print("Price: ");
        float productPrice = createProduct.nextFloat();

        ArrayList<Product> stockInventory = new ArrayList<>();
        stockInventory.add(new Product(productName, productCategory, productBrand, productVariant, productQuantity, productPrice));

        if(stockInventory.contains(new Product(productName, productCategory, productBrand, productVariant, productQuantity, productPrice)))
            System.out.println("Product already exists\n");
        else
            System.out.println("Product added successfully\n");
    }

    public void changeProduct(Product product){
        Scanner updateProduct = new Scanner(System.in);

        System.out.print("Product name: ");
        String productName = updateProduct.nextLine();
        System.out.print("Category: ");
        String productCategory = updateProduct.nextLine();
        System.out.print("Brand: ");
        String productBrand = updateProduct.nextLine();
        System.out.print("Variant: ");
        String productVariant = updateProduct.nextLine();
        System.out.print("Quantity: ");
        int productQuantity = updateProduct.nextInt();
        System.out.print("Price: ");
        float productPrice = updateProduct.nextFloat();

        product.setValues(productName, productBrand, productVariant, productQuantity, productPrice);
    }

    public void categorizeToFood(int index){
        Food foodHolder = new Food(stockInventory.get(index).getName(), stockInventory.get(index).getCategory(), stockInventory.get(index).getBrand(), stockInventory.get(index).getVariant(), stockInventory.get(index).getQuantity(), stockInventory.get(index).getPrice());
        stockInventory.set(index, foodHolder);
    }

    public void categorizeToBev(int index){
        Beverages bevHolder = new Beverages(stockInventory.get(index).getName(), stockInventory.get(index).getCategory(), stockInventory.get(index).getBrand(), stockInventory.get(index).getVariant(), stockInventory.get(index).getQuantity(), stockInventory.get(index).getPrice());
        stockInventory.set(index, bevHolder);
    }

    public void categorizeToToil(int index){
        Toiletries toilHolder = new Toiletries(stockInventory.get(index).getName(), stockInventory.get(index).getCategory(), stockInventory.get(index).getBrand(), stockInventory.get(index).getVariant(), stockInventory.get(index).getQuantity(), stockInventory.get(index).getPrice());
        stockInventory.set(index, toilHolder);
    }

    public void categorizeToClean(int index){
        Cleaning_Products cleanHolder = new Cleaning_Products(stockInventory.get(index).getName(), stockInventory.get(index).getCategory(), stockInventory.get(index).getBrand(), stockInventory.get(index).getVariant(), stockInventory.get(index).getQuantity(), stockInventory.get(index).getPrice());
        stockInventory.set(index, cleanHolder);
    }

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
