package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }

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

    public void updateEmployeeView() {
        view.showEmployeeDetails(model.getName());
    }

    @FXML
    Label employeeNameLabel;

    public void displayEmployeeName(String employeeName){
        employeeNameLabel.setText("Welcome back to U&P, " + employeeName + "!");
//        employeeName.setText(model.getName());
    }
}
