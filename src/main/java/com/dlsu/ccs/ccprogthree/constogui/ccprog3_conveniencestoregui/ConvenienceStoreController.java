package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.Stage;

public class ConvenienceStoreController {
    private Parent root;
    private Stage stage;

    // Customer Button; open to everyone
    public void customer(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ShelfGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    // Employee Button; restricted to employees
    public void employee(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("EmployeeLoginGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }

    // Closes the application
    public void exit(){
        stage.close();
    }
}