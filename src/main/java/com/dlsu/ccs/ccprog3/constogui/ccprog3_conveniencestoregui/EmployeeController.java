package com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
}
