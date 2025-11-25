package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

public class ReceiptView {
    public void issueReceipt(float rTotal_cost, float rReceived_amount, float rChange, float rTimestamp){
        System.out.println("Purchased Items: ");
        for (Product boughtItems : purchases){
            System.out.println(boughtItems.getName() + " | Quantity: " + boughtItems.getQuantity() + " | Total Price:" + boughtItems.getQuantity() * boughtItems.getPrice());
        }

        System.out.println("Total Cost: " + rTotal_cost);
        System.out.println("Received Amount: " + rReceived_amount);
        System.out.println("Change: " + rChange);
        System.out.println("Time Stamped: " + rTimestamp);
    }
}
