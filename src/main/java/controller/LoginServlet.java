package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.Account;
import model.bo.AccountManageBO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username =request.getParameter("username");
        String password=request.getParameter("password");
        AccountManageBO bo = new AccountManageBO();
        if(bo.getAccountbyUserPass(username,password)==null)
        {
            request.setAttribute("mess","Wrong user or pass");
            request.getRequestDispatcher("/Login.jsp").forward(request,response);
        }else {
            if(bo.getAccountbyUserPass(username,password).getId_role()==1)
            {
                response.sendRedirect("/Admin.jsp");
            }else {
                response.sendRedirect("/Home.jsp");
            }
        }

    }
}
