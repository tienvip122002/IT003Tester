module com.pdt.bmitester {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pdt.bmitester to javafx.fxml;
    exports com.pdt.bmitester;
}
