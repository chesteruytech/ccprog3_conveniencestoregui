module com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui to javafx.fxml;
    exports com.dlsu.ccs.ccprog3.constogui.ccprog3_conveniencestoregui;
}