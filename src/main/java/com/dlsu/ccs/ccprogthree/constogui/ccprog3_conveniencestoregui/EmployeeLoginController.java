package com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmployeeLoginController {
    @FXML
    TextField employeeNameTextField;

    public void validateEmployee(ActionEvent event) throws IOException {
        String employeeName = employeeNameTextField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Employee.fxml"));
        Parent root = loader.load();

        EmployeeController controller = loader.getController();
        controller.displayEmployeeName(employeeName);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
