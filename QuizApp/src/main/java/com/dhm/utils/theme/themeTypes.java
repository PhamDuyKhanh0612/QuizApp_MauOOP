/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhm.utils.theme;

import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public enum themeTypes {
    DEFAULT {
        @Override
        public void updateTheme(Scene scene) {
            themeManager.setTheme(new DefaultFactory());
            themeManager.applyTheme(scene);
        }
    }, DARK {
        @Override
        public void updateTheme(Scene scene) {
            themeManager.setTheme(new Darkfactory());
            themeManager.applyTheme(scene);
        }
    }, LIGHT {
        @Override
        public void updateTheme(Scene scene) {
            themeManager.setTheme(new LightFactory());
            themeManager.applyTheme(scene);
        }
    };
    
    public abstract void updateTheme(Scene scene);
}
