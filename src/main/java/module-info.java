module com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui to javafx.fxml;
    exports com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;
}