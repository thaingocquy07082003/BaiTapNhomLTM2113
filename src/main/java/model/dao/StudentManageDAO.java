package model.dao;

import model.bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentManageDAO {
    public ArrayList<Student> getAllStudent() {
        ArrayList<Student> result = new ArrayList<Student>();

        // Connect to database
        try {
            Connection con = new DBHelper().getConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from students";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Student Student = new Student(rs.getInt("mssv"), rs.getString("name_student"), rs.getString("username"));
                result.add(Student);
            }

        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Error:  " + e);
        }

        return result;
    }

    public Student getByMssv(int mssv) {
        ArrayList<Student> students = new StudentManageDAO().getAllStudent();
        for (Student student : students) {
            if (student.getMssv() == mssv) {
                return student;
            }
        }
        return null;
    }

    public void delete(int mssv) {
        try {
            String query = "delete from students where mssv=?";
            Connection con = new DBHelper().getConnection();
            PreparedStatement p = con.prepareStatement(query);
            p.setString(1, String.valueOf(mssv));
            p.executeUpdate();
            p.close();
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Error:  " + e);
        }
    }
    public void update(int mssv, String name_students,String username) {
        String query = "update students set name_student=?,username=? where mssv=mssv";
        try {
            Connection con = new DBHelper().getConnection();
            PreparedStatement p = con.prepareStatement(query);
            p.setString(1, name_students);
            p.setString(2, username);
            p.executeUpdate();
            p.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        StudentManageDAO dao = new StudentManageDAO();
        dao.delete(123);

    }
}
