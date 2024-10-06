
package main.java.com.perpustakaanApps.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
        public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
