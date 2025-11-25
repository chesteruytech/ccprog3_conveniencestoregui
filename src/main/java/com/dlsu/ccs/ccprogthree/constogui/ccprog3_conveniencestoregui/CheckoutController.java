package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

public class CheckoutController {
    private Checkout model;
    private CheckoutView view;

    public CheckoutController(Checkout model, CheckoutView view){
        this.model = model;
        this.view = view;
    }

    public void setCheckoutCustomer(Customer customer){
        model.setCustomer(customer);
    }
}
