
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lumiere
 */
public class koneksi_mysql {
    
    private static final String DB_URL = "jdbc:mysql://127.0.0.1/";
    private static final String DB_NAME = "db_buku";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "lumiere2327";
    private static final String mysqlUrl = ""+ DB_URL + DB_NAME +"?user="+ DB_USER +"&password="+DB_PASSWORD+"";
    
    private Connection connect;
    
    public Connection buatConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(mysqlUrl);
        }catch(ClassNotFoundException error) {
            System.out.println("Driver MySql tidak ditemukan!\n" + error);
        }catch(SQLException error){
            System.out.println("Internal Server Error\n" + error);
        }
        
        return connect;
    }
}
