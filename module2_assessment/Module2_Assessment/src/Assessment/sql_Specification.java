/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment;

import java.sql.*;

public class sql_Specification {
    private static Connection conn = null;
    

    public static Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bettystoredb", "root", "");
            System.out.println("Connected!");
            return conn;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public static void main(String[] args) {
        connect();
        
    }
    
}
