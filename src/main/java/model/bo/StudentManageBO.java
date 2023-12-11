package model.bo;

import model.bean.Student;
import model.dao.StudentManageDAO;

import java.util.ArrayList;

public class StudentManageBO {
    StudentManageDAO dao = new StudentManageDAO();
    public ArrayList<Student> getAllStudent() {
        return dao.getAllStudent();
    }
    public Student getByMssv(int mssv){
        return dao.getByMssv(mssv);
    }
}
