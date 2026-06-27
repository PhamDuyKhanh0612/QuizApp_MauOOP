package com.dhm.quizapp;

import com.dhm.utils.MyQuestionSingleton;
import com.dhm.utils.MyQuizAppSingleton;
import com.dhm.utils.theme.Darkfactory;
import com.dhm.utils.theme.themeManager;
import com.dhm.utils.theme.themeTypes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;


public class PrimaryController implements Initializable {
    @FXML public ComboBox<themeTypes> cbThemes;
    
    public void manageQuestion(ActionEvent e) {
        MyQuestionSingleton.getInstance().showQuestion("question");
    }
    
    public void pratice(ActionEvent e) {
        MyQuizAppSingleton.getInstance().ShowMsg("Coming Soon....");
    }
    
    public void exam(ActionEvent e) {
        MyQuizAppSingleton.getInstance().ShowMsg("Coming Soon....");
    }

    public void change(ActionEvent e) {
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(themeTypes.values()));
    }
}
