package model.bo;
import model.bean.*;
import model.dao.*;
import java.util.ArrayList;
public class StudentManageBO {
    StudentManageDAO studentManageDAO = new StudentManageDAO();
    public int GetMSSVByUsername(String username) {return studentManageDAO.GetStudentByUsername(username);}
    StudentManageDAO dao = new StudentManageDAO();
    public ArrayList<Student> getAllStudent() {
        return dao.getAllStudent();
    }
    public Student getByMssv(int mssv){
        return dao.getByMssv(mssv);
    }
    public void delete(int mssv) {
        dao.delete(mssv);
    }
    public void update(int mssv, String name_students,String username) {
        dao.update(mssv,name_students,username);
    }
}
