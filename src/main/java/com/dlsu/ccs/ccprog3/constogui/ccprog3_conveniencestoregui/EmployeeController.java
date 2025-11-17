package com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;

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
}
