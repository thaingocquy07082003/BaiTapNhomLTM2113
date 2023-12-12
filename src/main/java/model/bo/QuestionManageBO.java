package model.bo;

import model.bean.Question;
import model.dao.QuestionManageDAO;

import java.util.ArrayList;

public class QuestionManageBO {
    QuestionManageDAO dao = new QuestionManageDAO();
    public ArrayList<Question> getAllQuestion() {
        return dao.getAllQuestion();
    }
    public void insert( String question,int id_result) {
        dao.insert(question, id_result);
    }
}

