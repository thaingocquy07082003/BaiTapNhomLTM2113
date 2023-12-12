package model.dao;
import java.lang.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;
import java.sql.Statement;
import model.bean.*;
import model.bo.GetAllRoomsBO;

public class RoomManageDAO {
    public ArrayList<Room> Get_All_Room()
    {
        ArrayList<Room> rooms = new ArrayList<Room>();
        try
        {
            String url = "jdbc:mysql://localhost:3307/check_result";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM rooms";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id_room");
                String roomname = rs.getString("name_room");
                int time = rs.getInt("time");
                String room_pass = rs.getString("room_pass");
                Room room = new Room(id,roomname,time,room_pass);
                rooms.add(room);
            }
            rs.close();
//            stmt.executeUpdate(sql);
            stmt.close();
        }
        catch(Exception f)
        {
            System.out.println("Error "+ f);
        }
        return rooms;
    }

    public Room GetRoomByIDDAO(int id_room) {
        Room roomtmp = new Room();
        ArrayList<Room> rooms = Get_All_Room();
        for(Room room : rooms) {
            if(room.getId_room() == id_room) {
                return room;
            }
        }
        return roomtmp;
    }
}
