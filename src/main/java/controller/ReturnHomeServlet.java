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
@WebServlet("/ReturnHomeServlet")
public class ReturnHomeServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GetAllRoomsBO getAllRoomsBO = new GetAllRoomsBO();
        ArrayList<Room> rooms = getAllRoomsBO.Get_Room_List();
        String username = request.getParameter("username");
        request.setAttribute("rooms", rooms);
        request.setAttribute("username", username);
        request.getRequestDispatcher("/Home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
