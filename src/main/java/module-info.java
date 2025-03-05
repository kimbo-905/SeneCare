module com.example.projetmemoire {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.projetmemoire to javafx.fxml;
    exports com.example.projetmemoire;
}