package model.dao;
import java.lang.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;
import java.sql.Statement;
import model.bean.*;
public class GetTablePointDAO {
    public ArrayList<TablePoint> GetTBPointByMSSV(int MSSV) {
        ArrayList<TablePoint> tablePoints = new ArrayList<>();
        for(TablePoint tablePoint : GetAllTBPoint()) {
            if(tablePoint.getMssv() == MSSV) {
                tablePoints.add(tablePoint);
            }
        }
        return tablePoints;
    }

    public ArrayList<TablePoint> GetAllTBPoint()
    {
        ArrayList<TablePoint> tablePoints = new ArrayList<>();
        try
        {
            String url = "jdbc:mysql://localhost:3307/check_result";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM table_point ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int mssv = rs.getInt("mssv");
                int id_room = rs.getInt("id_room");
                double point_student = rs.getDouble("point_student");
                TablePoint tb = new TablePoint(id_room,mssv,point_student);
                tablePoints.add(tb);
            }
            rs.close();
//            stmt.executeUpdate(sql);
            stmt.close();
        }
        catch(Exception f)
        {
            System.out.println("Error "+ f);
        }
        return  tablePoints;
    }
}
