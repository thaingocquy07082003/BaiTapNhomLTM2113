package model.dao;
import java.lang.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;
import java.sql.Statement;
import model.bean.*;
public class AddPointDAO {
    public void AddPoint(int mssv, int id_room , double point_student)
    {
        try
        {
            String url = "jdbc:mysql://localhost:3307/check_result";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement stmt = con.createStatement();

            String sql = "INSERT INTO table_point VALUES('"+id_room+"','"+mssv+"','"+point_student+"')";
            stmt.executeUpdate(sql);
            stmt.close();
        }
//        +total+"','"
        catch(Exception f)
        {
            System.out.println("Error "+ f);
        }
    }
}
