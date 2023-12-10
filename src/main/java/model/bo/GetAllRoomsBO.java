package model.bo;

import model.bean.*;
import model.dao.RoomManageDAO;
import java.util.ArrayList;
public class GetAllRoomsBO {
    RoomManageDAO roomManageDAO = new RoomManageDAO();
    public ArrayList<Room> Get_Room_List() { return roomManageDAO.Get_All_Room();}


}
