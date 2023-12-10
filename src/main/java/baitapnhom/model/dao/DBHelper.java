package baitapnhom.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
    public  Connection getConnection() {

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/check_result", "root", "Thuhoa040902");
            System.out.println("sedd");
        } catch (Exception e) {
            System.err.print("Can't connect to MySQL");
        }
        return con;
    }

}
