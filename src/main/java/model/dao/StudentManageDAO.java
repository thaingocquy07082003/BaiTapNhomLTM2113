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
}
