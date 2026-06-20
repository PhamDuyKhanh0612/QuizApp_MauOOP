/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhm.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyQuizAppSingleton {
    private static MyQuizAppSingleton instance;
    private final Alert alert;
    
    private MyQuizAppSingleton() {
        this.alert = new Alert(Alert.AlertType.INFORMATION);
        this.alert.setTitle("QuizApp");
        this.alert.setHeaderText("QuizApp");
    }
    
    public static MyQuizAppSingleton getInstance() {
        if(instance == null)
            instance = new MyQuizAppSingleton();
        
        return instance;
    } 
    
    public void ShowMsg(String Content) {
        this.alert.setContentText(Content);
        this.alert.show();
    }
}
