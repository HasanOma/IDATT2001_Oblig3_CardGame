module Oblig3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens Oblig3 to javafx.fxml;
    exports Oblig3;
}