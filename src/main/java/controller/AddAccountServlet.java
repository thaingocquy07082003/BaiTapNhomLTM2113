package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.Account;
import model.bo.AccountManageBO;

@WebServlet("/AddAccountServlet")
public class AddAccountServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public AddAccountServlet() {

    }
    AccountManageBO accountBO = new AccountManageBO();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username =request.getParameter("userName");
        String password=request.getParameter("password");
        String repassword= request.getParameter("repassword");
        if(!password.equals(repassword))
        {
            request.setAttribute("re","different with password");
            request.getRequestDispatcher("/Register.jsp").forward(request,response);

        }else{
            if(accountBO.getAccount(username).getUsername()==null)
            {
                accountBO.insert(username,password);
                response.sendRedirect("/Login.jsp");

            }else {
                request.setAttribute("exit","existed username || you've haven a account? Let's Log in  ");
                request.getRequestDispatcher("/Register.jsp").forward(request,response);
            }
        }


    }

}

