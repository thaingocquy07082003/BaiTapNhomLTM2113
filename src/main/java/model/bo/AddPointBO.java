package model.bo;
import model.bean.*;
import model.dao.*;
import java.util.ArrayList;
public class AddPointBO {
    AddPointDAO addPointDAO = new AddPointDAO();
    public void AddPoint(int mssv, int id_room , double point_student)  {addPointDAO.AddPoint(mssv,id_room,point_student);}
}
