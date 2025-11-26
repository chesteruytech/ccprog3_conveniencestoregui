package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.util.Scanner;

public class Checkout {
    private float total_cost;
    private float amount_given;
    private Customer customer;
    // Set out the current Customer using the checkout
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    // Computes the discount based on the customer's age and membership
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
    // Calculates the total prices of the products the customer bought
    public float calculateTotal(){
        for(int i = 0; i < customer.getAllProducts().size(); i++){
           total_cost += customer.getAllProducts().get(i).getPrice() * customer.getAllProducts().get(i).getQuantity();
        }

        return total_cost - (this.computeDiscountLogic() * total_cost);
    }
    // Calculates the change
    public float giveChange(){
        Scanner iLoveCash = new Scanner(System.in);

        System.out.print("Enter amount given: Php");
        amount_given = iLoveCash.nextFloat();

        if(amount_given >= this.calculateTotal())
            return amount_given - this.calculateTotal();

        return 0;
    }

//    public Receipt printReceipt(){
////        return new Receipt(customer.getAllProducts(), CalculateTotal(), amount_given, giveChange());
//    }
}
