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
import model.bean.Room;
import model.bo.AccountManageBO;
import model.bo.GetAllRoomsBO;

@WebServlet("/UpdateAccountServlet")
public class UpdateAccountServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        AccountManageBO accountManageBO = new AccountManageBO();
        accountManageBO.Update(username,password);
        GetAllRoomsBO getAllRoomsBO = new GetAllRoomsBO();
        ArrayList<Room> rooms = getAllRoomsBO.Get_Room_List();
        request.setAttribute("rooms", rooms);
        request.setAttribute("username", username);
        request.getRequestDispatcher("/Home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req,resp);
    }
}
