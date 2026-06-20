/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhm.utils.theme;

import com.dhm.quizapp.App;

/**
 *
 * @author admin
 */
public class LightFactory extends themeAstractFactory{

    @Override
    public String getStyleSheet() {
       return App.class.getResource("light.css").toExternalForm();
    }
    
}
