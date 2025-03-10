module gabriel.lab5colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens gabriel.lab5colorchooser to javafx.fxml;
    exports gabriel.lab5colorchooser;
}