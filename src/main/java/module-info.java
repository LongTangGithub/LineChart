module com.example.linechart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.linechart to javafx.fxml;
    exports com.example.linechart;
}