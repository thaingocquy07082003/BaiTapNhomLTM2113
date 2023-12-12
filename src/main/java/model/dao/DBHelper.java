package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
    public Connection getConnection() {

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/check_result", "root", "");
        } catch (Exception e) {
            System.err.print("Can't connect to MySQL");
        }
        return con;
    }
}
