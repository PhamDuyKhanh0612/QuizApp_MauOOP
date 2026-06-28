/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dhm.quizapp;

import com.dhm.pojo.Category;
import com.dhm.pojo.Question;
import com.dhm.services.CategoryServices;
import com.dhm.services.QuestionServices;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Windows
 */
public class QuestionController implements Initializable {
    @FXML private ComboBox<Category> cb;
    @FXML private TableView<Question> tbv;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CategoryServices c = new CategoryServices();
        QuestionServices q = new QuestionServices();
        this.loadCol();
        try {
            this.cb.setItems(FXCollections.observableList(c.cates()));
            this.tbv.setItems(FXCollections.observableList(q.q()));
        } catch (SQLException ex) {
            System.getLogger(QuestionController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }     
    
    private void loadCol() {
        TableColumn colId = new TableColumn("id");
        colId.setCellValueFactory(new PropertyValueFactory("id"));
        
        TableColumn colContent = new TableColumn("nội dung câu hỏi");
        colContent.setCellValueFactory(new PropertyValueFactory("content"));
        
        TableColumn colHint = new TableColumn("gợi ý");
        colHint.setCellValueFactory(new PropertyValueFactory("hint"));
        
        TableColumn colCatteId = new TableColumn("category id");
        colCatteId.setCellValueFactory(new PropertyValueFactory("category"));
        
        TableColumn colLvid = new TableColumn("level id");
        colLvid.setCellValueFactory(new PropertyValueFactory("level"));
        
        this.tbv.getColumns().addAll(colId,colContent,colHint, colCatteId, colLvid);
    }
}
