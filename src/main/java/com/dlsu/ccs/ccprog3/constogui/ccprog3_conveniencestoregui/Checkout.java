package com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;

import java.util.Scanner;

public class Checkout {
    private float total_cost;
    private float amount_given;
    private Customer customer;

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public float computeDiscountLogic(){
        if (customer.getAge() >= 60 && customer.getMembership()){  // Senior and Member
            return 0.30f;
        } else if (customer.getAge() <= 60 && customer.getMembership()) {  // Member only
            return 0.10f;
        } else if (customer.getAge() >= 60 && !customer.getMembership()) {  // Senior only
            return 0.20f;
        } else {
            return 0.00f;
        }
    }

    public float calculateTotal(){
        for(int i = 0; i < customer.getAllProducts().size(); i++){
           total_cost += customer.getAllProducts().get(i).getPrice() * customer.getAllProducts().get(i).getQuantity();
        }

        return total_cost - (this.computeDiscountLogic() * total_cost);
    }

    public float giveChange(){
        Scanner iLoveCash = new Scanner(System.in);

        System.out.print("Enter amount given: Php");
        amount_given = iLoveCash.nextFloat();

        if(amount_given >= this.calculateTotal())
            return amount_given - this.calculateTotal();

        return 0;
    }

    public Receipt printReceipt(){
//        return new Receipt(customer.getAllProducts(), CalculateTotal(), amount_given, giveChange());
    }
}
