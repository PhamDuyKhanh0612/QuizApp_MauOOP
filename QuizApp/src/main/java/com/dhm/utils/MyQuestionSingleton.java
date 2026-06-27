/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhm.utils;

import com.dhm.quizapp.App;
import com.dhm.utils.theme.themeManager;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Windows
 */
public class MyQuestionSingleton {
    private static MyQuestionSingleton instance;
    private final Stage stage;
    
    private MyQuestionSingleton() {
        this.stage = new Stage();
        this.stage.setTitle("Question App");
    }
    
    public static MyQuestionSingleton getInstance() {
        if(instance == null) 
            instance = new MyQuestionSingleton();
        
        return instance;
    }
    
    public void showQuestion(String fxml) {
        if(!this.stage.isShowing()) {
            Scene scene;
            try {
                scene = new Scene(new FXMLLoader(App.class.getResource(fxml + ".fxml")).load());
                
                themeManager.applyTheme(scene);
                
                this.stage.setScene(scene);
                this.stage.show();
            } catch (IOException ex) {
                System.getLogger(MyQuestionSingleton.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
            
    }
}
