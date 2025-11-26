package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;

public class EmployeeController {
    private Employee model;

    public String getEmployeeName() {
        return model.getName();
    }

    public ArrayList<Product> getStockInventory() {
        return model.getStockInventory();
    }

    public void setName(String name) {
        model.setName(name);
    }

    public void setStockInventory(ArrayList<Product> stockInventory) {
        model.setStockInventory(stockInventory);
    }
}
