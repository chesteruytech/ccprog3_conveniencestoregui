package com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;

public class CustomerView {
    public void showEmployeeDetails(String cName, int cAge, int cMembership, float cMoney){
        System.out.println("Customer: " + cName);
        System.out.println("Age: " + cAge);
        System.out.println("Membership: " + cMembership);
        System.out.println("Balance: " + cMoney);
    }
}
