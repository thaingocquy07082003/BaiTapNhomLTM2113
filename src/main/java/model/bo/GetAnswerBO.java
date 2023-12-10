package model.bo;
import model.bean.*;
import model.dao.*;
import java.util.ArrayList;
public class GetAnswerBO {
    GetAnswerDAO getAnswerDAO = new GetAnswerDAO();
    public Answer GetAnswer(int id_answer) {return getAnswerDAO.GetAnswer(id_answer);}
}
