package com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;

public class ProductView {
    public static void showProductInformation(String pName, String pCategory, String pBrand, String pVariant,
                                              int pQuantity, float pPrice){
        System.out.println(pName);
        System.out.println("Category: " + pCategory);
        System.out.println("Brand: " + pBrand);
        System.out.println("Variant: " + pVariant);
        System.out.println(pQuantity);
        System.out.println(pPrice);
    }
}