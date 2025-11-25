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

    public ArrayList<Product> getPurchases() {
        return purchases;
    }

    public float getTotalCost(){
        return totalCost;
    }

    public float getReceivedAmount(){
        return receivedAmount;
    }

    public float getChange(){
        return change;
    }

    public float getTimestamp(){
        return timestamp;
    }

    public void setPurchases(ArrayList<Product> purchases) {
        this.purchases = purchases;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public void setReceivedAmount(float receivedAmount){
        this.receivedAmount = receivedAmount;
    }
}
