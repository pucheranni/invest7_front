module agibank.invest7_frontend {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens agibank.invest7_frontend to javafx.fxml;
    exports agibank.invest7_frontend;
}