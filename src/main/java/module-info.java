module mike.lab5tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens mike.lab5tipcalculator to javafx.fxml;
    exports mike.lab5tipcalculator;
}