module cse213.Metro {
    requires javafx.controls;
    requires javafx.fxml;

    exports cse213.Metro;
    opens cse213.Metro to javafx.fxml,javafx.base;
    opens cse213.Metro.User_01 to javafx.fxml,javafx.base;
    opens cse213.Metro.User_02 to javafx.fxml,javafx.base;
    exports cse213.Metro.Controller;
    opens cse213.Metro.Controller to javafx.fxml,javafx.base;

}
