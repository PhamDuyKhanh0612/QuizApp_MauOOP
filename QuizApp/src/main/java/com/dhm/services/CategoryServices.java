/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhm.services;

import com.dhm.pojo.Category;
import com.dhm.utils.MyConnectionSingleton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class CategoryServices {
    public List<Category> cates() throws SQLException {
        Connection conn = MyConnectionSingleton.getInstance().Connect();
            
            String sql = "SELECT * FROM category";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            List<Category> cates = new ArrayList<>();
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                
                cates.add(new Category(id, name));
            }
        return cates;    
    }
}
