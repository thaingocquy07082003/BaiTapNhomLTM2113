package model.dao;
import java.lang.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;
import java.sql.Statement;
import model.bean.*;

public class QuestionManageDAO {
    public ArrayList<Question> GetQuestionForRoom(int idroom) {
        ArrayList<Question> questions = new ArrayList<Question>();
        try
        {
            String url = "jdbc:mysql://localhost:3307/check_result";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM questions WHERE id_room="+idroom;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id_question = rs.getInt("id_question");
                int id_answer = rs.getInt("id_answer");
                int id_result = rs.getInt("id_result");
                int id_room = rs.getInt("id_room");
                String question_content = rs.getString("question");
                Question qt = new Question(id_question,question_content,id_answer,id_result,id_room);
                questions.add(qt);
            }
            rs.close();
//            stmt.executeUpdate(sql);
            stmt.close();
        }
        catch(Exception f)
        {
            System.out.println("Error "+ f);
        }
        return questions;
    }
}
