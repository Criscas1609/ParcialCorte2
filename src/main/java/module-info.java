module com.example.parcialcorte2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.parcialcorte2 to javafx.fxml;
    exports com.example.parcialcorte2;
}