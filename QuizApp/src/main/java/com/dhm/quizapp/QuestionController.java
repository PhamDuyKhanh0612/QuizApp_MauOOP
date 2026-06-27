/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dhm.quizapp;

import com.dhm.pojo.Category;
import com.dhm.services.CategoryServices;
import com.dhm.utils.MyConnectionSingleton;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Windows
 */
public class QuestionController implements Initializable {
    @FXML private ComboBox<Category> cb;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CategoryServices c = new CategoryServices();
        try {
            this.cb.setItems(FXCollections.observableList(c.cates()));
        } catch (SQLException ex) {
            System.getLogger(QuestionController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }     
}
