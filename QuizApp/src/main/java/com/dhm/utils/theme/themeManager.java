/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhm.utils.theme;

import com.dhm.quizapp.App;
import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public class themeManager {
    private static themeAstractFactory theme = new DefaultFactory();

    /**
     * @param aTheme the theme to set
     */
    public static void setTheme(themeAstractFactory aTheme) {
        theme = aTheme;
    }
    
    public static void applyTheme(Scene scene) {
        scene.getRoot().getStylesheets().clear();
        scene.getRoot().getStylesheets().add(theme.getStyleSheet());
    }
}
