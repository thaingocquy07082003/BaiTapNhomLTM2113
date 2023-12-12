package model.dao;
import java.lang.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    public ArrayList<Question> getAllQuestion() {
        ArrayList<Question> result = new ArrayList<Question>();

        // Connect to database
        try {
            Connection con = new DBHelper().getConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from questions";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Question question= new Question(rs.getInt("id_question"),rs.getString("question"),rs.getInt("id_answer"),rs.getInt("id_result"),rs.getInt("id_room"));
                result.add(question);
            }

        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Error:  " + e);
        }

        return result;
    }
    public void insert(String question,int id_result) {
        AnswerManageDAO  dao = new AnswerManageDAO();
        int id_answer;
        ArrayList<Question> questions = getAllQuestion();
        int total = questions.size() +1 ;
        String query = "insert into questions(question,id_answer,id_result,id_room) values(?,?,?,1)";
        try {
            Connection con = new DBHelper().getConnection();
            PreparedStatement p = con.prepareStatement(query);
            id_answer = dao.getAllAnswer().get(getAllQuestion().size()-1).getId_answer();
            p.setString(1, question);
            p.setString(2, String.valueOf(id_answer));
            p.setString(3, String.valueOf(id_result));
            p.executeUpdate();
            p.close();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        QuestionManageDAO dao = new QuestionManageDAO();
        dao.insert("a",1);
        List<Question> questions = dao.getAllQuestion();
        for(Question question:questions)
        {
            System.out.println(question);
        }

    }
}
