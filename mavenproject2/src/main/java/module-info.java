module com.mycompany.mavenproject2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.mycompany.mavenproject2 to javafx.fxml;
    exports com.mycompany.mavenproject2;
}
