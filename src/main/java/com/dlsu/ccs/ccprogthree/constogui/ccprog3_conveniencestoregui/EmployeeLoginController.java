package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmployeeLoginController {
    @FXML
    TextField employeeNameTextField;
    @FXML
    Button backButton;

    public void validateEmployee(ActionEvent event) throws IOException {
        String employeeName = employeeNameTextField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployeeGUI.fxml"));
        Parent root = loader.load();

        ManagementController controller = loader.getController();
        controller.displayName(employeeName);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void backToMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene (root));
        stage.show();
    }
}
