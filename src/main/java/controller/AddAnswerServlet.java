package controller;

import model.bo.AccountManageBO;
import model.bo.AnswerManageBO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddAnswerServlet")
public class AddAnswerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public AddAnswerServlet() {

    }
    AnswerManageBO bo = new AnswerManageBO();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String answer_a =request.getParameter("answer_a");
        String answer_b =request.getParameter("answer_b");
        String answer_c =request.getParameter("answer_c");
        String answer_d =request.getParameter("answer_d");
        bo.insert(answer_a,answer_b,answer_c,answer_d);
        response.sendRedirect("/Admin.jsp");
    }

}
