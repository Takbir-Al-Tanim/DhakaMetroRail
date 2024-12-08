module cse213.Metro {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.Metro to javafx.fxml;
    opens cse213 to javafx.fxml;


    exports cse213.Metro;
    exports cse213.Metro.User_01;
    opens cse213.Metro.User_01 to javafx.fxml;
}