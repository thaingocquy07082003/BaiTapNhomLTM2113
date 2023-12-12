package model.bo;

import model.bean.Answer;
import model.dao.AccountManageDAO;
import model.dao.AnswerManageDAO;

import java.util.ArrayList;

public class AnswerManageBO {
    AnswerManageDAO dao = new AnswerManageDAO();
    public ArrayList<Answer> getAllAnswer() {
        return dao.getAllAnswer();
    }
    public void insert( String answer_a,  String answer_b, String answer_c, String answer_d) {
        dao.insert(answer_a, answer_b, answer_c, answer_d);
    }
}

