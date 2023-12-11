package model.dao;

import model.bean.TablePoint;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TablePointManageDAO {
    public ArrayList<TablePoint> getAllTablePoint() {
        ArrayList<TablePoint> result = new ArrayList<TablePoint>();

        // Connect to database
        try {
            Connection con = new DBHelper().getConnection();
            Statement stmt = con.createStatement();
            String sql = "select r.name_room,s.username,s.mssv,s.name_student,t.point_student from rooms r\n" +
                    "join table_point t on t.id_room=r.id_room\n" +
                    "join students s on s.mssv = s.mssv";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TablePoint TablePoint= new TablePoint(rs.getString("name_room"),rs.getString("username"),rs.getInt("mssv"),rs.getString("name_student"),rs.getDouble("point_student"));
                result.add(TablePoint);
            }

        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Error:  " + e);
        }

        return result;
    }


    public static void main(String[] args) {
        TablePointManageDAO dao = new TablePointManageDAO();

        List<TablePoint> TablePoints = dao.getAllTablePoint();
        for(TablePoint TablePoint:TablePoints)
        {
            System.out.println(TablePoint);
        }

    }
}
