/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blood_donors_project;

import java.sql.*;

/**
 *
 * @author subha
 */
public class ConnectionProvider {
    //public Connection con;

    /**
     *
     * @return
     */
    public static Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root", "Baharganj@20");
           // System.out.println("Successfully Connected");
        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }
        return con;
    }
}
