package loginform;

import java.sql.*;

public class MyConnection {
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/myDatabase", "root", "vcv27082000");
            
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}