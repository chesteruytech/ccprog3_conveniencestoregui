package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;

public class Receipt {
    private ArrayList<Product> purchases;
    private float totalCost;
    private float receivedAmount;
    private final float change;
    private final float timestamp;

    public Receipt(ArrayList<Product> purchases, float totalCost, float receivedAmount, float change, float timestamp){
        this.purchases = purchases;
        this.totalCost = totalCost;
        this.receivedAmount = receivedAmount;
        this.change = change;
        this.timestamp = timestamp;
    }
    // Getter method of the purchases bought from the customer on the receipt
    public ArrayList<Product> getPurchases() {
        return purchases;
    }
    // Getter method of the total cost of products bought on the receipt  
    public float getTotalCost(){
        return totalCost;
    }
    // Getter method of the received amount the customer gives during checkout
    public float getReceivedAmount(){
        return receivedAmount;
    }
    // Getter method of the change back to the customer
    public float getChange(){
        return change;
    }
    // Getter method of the time stamped on the receipt
    public float getTimestamp(){
        return timestamp;
    }
    // Setter method of the purchases bought
    public void setPurchases(ArrayList<Product> purchases) {
        this.purchases = purchases;
    }
    // Setter method of the total cost 
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
    // Setter method of the received amount
    public void setReceivedAmount(float receivedAmount){
        this.receivedAmount = receivedAmount;
    }
}
