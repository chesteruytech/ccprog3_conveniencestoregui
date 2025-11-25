module com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.base;
    requires javafx.graphics;


    opens com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui to javafx.fxml;
    exports com.dlsu.ccs.ccprogthree.constogui.ccprog3_conveniencestoregui;
}