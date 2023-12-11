package controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

import model.bo.*;
import model.bean.*;
import model.dao.GetAnswerDAO;
import model.dao.RoomManageDAO;

@WebServlet("/QuestionViewServlet")
public class QuestionViewServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String destination= "/Exam.jsp";
        int id_room = Integer.parseInt(req.getParameter("id_room"));
        String username = req.getParameter("username");
        GetAnswerDAO getAnswerDAO = new GetAnswerDAO();
        GetQuestionBO getQuestionBO = new GetQuestionBO();
        GetRoomByIDBO getRoomByIDBO = new GetRoomByIDBO();
        ArrayList<Question> questions = getQuestionBO.GetQuestion(id_room);
        ArrayList<Answer> answers = new ArrayList<Answer>();
        for(Question question: questions) {
            answers.add(getAnswerDAO.GetAnswer(question.getId_answer()));
        }
        req.setAttribute("questions",questions);
        req.setAttribute("answers",answers);
        req.setAttribute("time",getRoomByIDBO.GetRoom(id_room).getTime());
        req.setAttribute("id_room",id_room);
        req.setAttribute("username",username);
        RequestDispatcher rd = (RequestDispatcher) getServletContext().getRequestDispatcher(destination);
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
