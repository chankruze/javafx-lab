module com.geekofia.javafxlab {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.geekofia.javafxlab to javafx.fxml;
    exports com.geekofia.javafxlab;
}