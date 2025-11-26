package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EmployeeController {
    private Employee model;
    @FXML Label employeeNameLabel;

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

    public void displayName(String username){
        employeeNameLabel.setText("Welcome back to U&P, " + username + "!");
    }
}
