/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhm.services;

import com.dhm.pojo.Category;
import com.dhm.pojo.Question;
import com.dhm.utils.MyConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class QuestionServices {
    public List<Question> q() throws SQLException {
        Connection conn = MyConnectionSingleton.getInstance().Connect();
            
            String sql = "SELECT * FROM question";
            PreparedStatement stm = conn.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            
            List<Question> q = new ArrayList<>();
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                
                q.add(new Question.Builder().setId(id).setContent(name).buil());
            }
        return q;
    } 
}
