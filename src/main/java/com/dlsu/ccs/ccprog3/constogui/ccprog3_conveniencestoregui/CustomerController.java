package com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;

public class CustomerController {
    private Customer model;
    private CustomerView view;

    public CustomerController(Customer model, CustomerView view){
        this.model = model;
        this.view = view;
    }
}
