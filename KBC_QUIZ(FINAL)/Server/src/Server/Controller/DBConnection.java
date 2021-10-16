/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author STUDENT
 */
public class DBConnection {
    public static Connection conn;
    
    public Connection createConnection(String db, String user, String password){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                    + "databaseName="+db+ ";user="+user+";password="+password);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("SQL Server Connected");
        return conn;
    }
}
