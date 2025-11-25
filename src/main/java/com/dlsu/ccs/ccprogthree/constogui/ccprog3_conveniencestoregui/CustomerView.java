package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

public class CustomerView {
    public void showEmployeeDetails(String cName, int cAge, boolean cMembership, float cMoney){
        System.out.println("Customer: " + cName);
        System.out.println("Age: " + cAge);
        System.out.println("Membership: " + cMembership);
        System.out.println("Balance: " + cMoney);
    }
}
