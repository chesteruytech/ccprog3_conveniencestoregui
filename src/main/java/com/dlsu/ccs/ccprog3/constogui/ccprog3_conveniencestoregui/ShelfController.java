package com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;

import java.util.ArrayList;

public class ShelfController {
    private Shelf model;
    private ShelfView view;

    public ShelfController(Shelf model, ShelfView view) {
        this.model = model;
        this.view = view;
    }

    public int getShelfNumber() {
        return model.getNumber();
    }

    public ArrayList<Product> getProductsInShelf() {
        return model.getProducts();
    }

    public void setProductsToShelf(ArrayList<Product> products) {
        model.setProducts(products);
    }

    public void updateShelfView() {
        view.showProducts();
    }
}
