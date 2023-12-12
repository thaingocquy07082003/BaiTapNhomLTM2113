package model.dao;
import model.bean.Answer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AnswerManageDAO {
    public ArrayList<Answer> getAllAnswer() {
        ArrayList<Answer> result = new ArrayList<Answer>();

        // Connect to database
        try {
            Connection con = new DBHelper().getConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from answers";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Answer Answer= new Answer(rs.getInt("id_answer"),rs.getString("answer_a"),rs.getString("answer_b"),rs.getString("answer_c"),rs.getString("answer_d"));
                result.add(Answer);
            }

        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Error:  " + e);
        }

        return result;
    }
    public void insert( String answer_a,  String answer_b, String answer_c, String answer_d) {
        String query = "insert into answers(answer_a,answer_b,answer_c,answer_d) values(?,?,?,?)";
        try {
            Connection con = new DBHelper().getConnection();
            PreparedStatement p = con.prepareStatement(query);
            p.setString(1, answer_a);
            p.setString(2, answer_b);
            p.setString(3, answer_c);
            p.setString(4, answer_d);
            p.executeUpdate();
            p.close();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        AnswerManageDAO dao = new AnswerManageDAO();
        dao.insert("a","b","c","c");
        List<Answer> Answers = dao.getAllAnswer();
        for(Answer Answer:Answers)
        {
            System.out.println(Answer);
        }

    }
}

