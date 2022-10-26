module com.example.parcialcorte2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.parcialcorte2 to javafx.graphics;
    exports com.example.parcialcorte2;
    exports com.example.parcialcorte2.controller to javafx.graphics;
    opens com.example.parcialcorte2.controller to javafx.fxml;
}