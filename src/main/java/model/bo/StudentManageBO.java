package model.bo;
import model.bean.*;
import model.dao.*;
import java.util.ArrayList;
public class StudentManageBO {
    StudentManageDAO studentManageDAO = new StudentManageDAO();
    public int GetMSSVByUsername(String username) {return studentManageDAO.GetStudentByUsername(username);}
}
