package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;

public class ReceiptController {
    private Receipt model;
    private ReceiptView view;

    public ReceiptController(Receipt model, ReceiptView view){
        this.model = model;
        this.view = view;
    }

    public ArrayList<Product> getReceiptPurchases() {
        return model.getPurchases();
    }

    public float getReceiptTotalCost(){
        return model.getTotalCost();
    }

    public float getReceiptReceivedAmount(){
        return model.getReceivedAmount();
    }

    public float getReceiptChange(){
        return model.getChange();
    }

    public float getReceiptTimestamp(){
        return model.getTimestamp();
    }

    public void setPurchases(ArrayList<Product> purchases) {
        model.setPurchases(purchases);
    }

    public void setTotalCost(float totalCost) {
        model.setTotalCost(totalCost);
    }

    public void setReceivedAmount(float receivedAmount){
        model.setReceivedAmount(receivedAmount);
    }

    public void updateReceiptView(){
//        view.issueReceipt(customer.getAllProducts(), CalculateTotal(), amount_given, giveChange());
    }
}
