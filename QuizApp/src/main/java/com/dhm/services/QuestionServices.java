/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhm.services;

import com.dhm.pojo.Category;
import com.dhm.pojo.Question;
import com.dhm.pojo.level;
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
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            
            List<Question> q = new ArrayList<>();
            while(rs.next()) {
                int id = rs.getInt("id");
                String content = rs.getString("content");
                String hint = rs.getString("hint");
                int cateDB = rs.getInt("category_id");
                int lvDB = rs.getInt("level_id");
                Category c = new Category();
                c.setId(cateDB);
                level l = new level();
                l.setId(lvDB);
                
                q.add(new Question.Builder().setId(id).setContent(content).setHint(hint).setCategory(c).setLevel(l).buil());
            }
        return q;
    } 
}
