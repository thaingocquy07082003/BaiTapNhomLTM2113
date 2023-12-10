package model.dao;
import java.lang.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;
import java.sql.Statement;
import model.bean.*;
public class GetAnswerDAO {
    public Answer GetAnswer(int idanswer) {
        Answer answer = new Answer();
        try
        {
            String url = "jdbc:mysql://localhost:3307/check_result";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM answers WHERE id_answer="+idanswer;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String answer_a = rs.getString("answer_a");
                String answer_b = rs.getString("answer_b");
                String answer_c = rs.getString("answer_c");
                String answer_d = rs.getString("answer_d");
                int id_answer = rs.getInt("id_answer");
                Answer awr = new Answer(id_answer,answer_a,answer_b,answer_c,answer_d);
                answer = awr;
            }
            rs.close();
//            stmt.executeUpdate(sql);
            stmt.close();
        }
        catch(Exception f)
        {
            System.out.println("Error "+ f);
        }
        return  answer;
    }
}
