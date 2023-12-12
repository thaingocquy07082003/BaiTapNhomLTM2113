package model.dao;
import java.lang.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;
import java.sql.Statement;
import model.bean.*;
public class StudentManageDAO {
    public int GetStudentByUsername(String username) {
        int i=0;
        ArrayList<Student> students = GetAllStudent();
        for (Student student : students)
        {
            if(Objects.equals(student.getUsername(), username))
            {
                return student.getMssv();
            }
        }
        return i;  // mssv cua student
    }

    public ArrayList<Student> GetAllStudent()
    {
        ArrayList<Student> students = new ArrayList<>();
        try
        {
            String url = "jdbc:mysql://localhost:3307/check_result";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM students ";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int mssv = rs.getInt("mssv");
                String name_student = rs.getString("name_student");
                String username = rs.getString("username");
                Student student = new Student(mssv,name_student,username);
                students.add(student);
            }
            rs.close();
//            stmt.executeUpdate(sql);
            stmt.close();
        }
        catch(Exception f)
        {
            System.out.println("Error "+ f);
        }
        return students;
    }

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
        String query = "update students set name_student=?,username=? where mssv="+mssv;
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
