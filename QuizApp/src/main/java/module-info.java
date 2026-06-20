module com.dhm.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dhm.quizapp to javafx.fxml;
    exports com.dhm.quizapp;
}
