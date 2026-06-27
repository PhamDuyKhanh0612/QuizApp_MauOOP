module com.dhm.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.dhm.quizapp to javafx.fxml;
    exports com.dhm.quizapp;
    exports com.dhm.pojo;
}
