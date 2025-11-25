package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

public class CustomerController {
    private Customer model;
    private CustomerView view;

    public CustomerController(Customer model, CustomerView view){
        this.model = model;
        this.view = view;
    }

    public String getCustomerName(){
        return model.getName();
    }

    public int getCustomerAge(){
        return model.getAge();
    }

    public boolean getCustomerMembership(){
        return model.getMembership();
    }

    public float getCustomerMoney(){
        return model.getMoney();
    }

    public void setCustomerName(String name){
        model.setName(name);
    }

    public void setCustomerAge(int age){
        model.setAge(age);
    }

    public void setMembership(boolean membership){
        model.setMembership(membership);
    }

    public void updateCustomerView(){
        view.showEmployeeDetails(model.getName(), model.getAge(), model.getMembership(), model.getMoney());
    }
}