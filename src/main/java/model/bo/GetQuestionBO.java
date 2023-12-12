package model.bo;
import model.bean.*;
import model.dao.*;
import java.util.ArrayList;
public class GetQuestionBO {
    QuestionManageDAO questionManageDAO = new QuestionManageDAO();
    public ArrayList<Question> GetQuestion(int id_room) {return questionManageDAO.GetQuestionForRoom(id_room);}
}
