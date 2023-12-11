package model.dao;

import model.bean.Question;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuestionManageDAO {
    public ArrayList<Question> getAllQuestion() {
        ArrayList<Question> result = new ArrayList<Question>();

        // Connect to database
        try {
            Connection con = new DBHelper().getConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from questions";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Question question= new Question(rs.getInt("id_question"),rs.getString("question"),rs.getInt("id_answer"),rs.getInt("id_result"));
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
        String query = "insert into questions(question,id_answer,id_result) values(?,?,?)";
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
