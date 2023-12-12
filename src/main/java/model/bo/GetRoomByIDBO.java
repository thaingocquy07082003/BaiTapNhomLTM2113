package model.bo;

import model.bean.*;
import model.dao.RoomManageDAO;
import java.util.ArrayList;
public class GetRoomByIDBO {
    RoomManageDAO roomManageDAO = new RoomManageDAO();
    public Room GetRoom(int id) { return  roomManageDAO.GetRoomByIDDAO(id);}
}
