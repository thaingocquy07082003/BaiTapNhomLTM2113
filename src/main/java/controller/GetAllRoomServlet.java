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
@WebServlet("/GetAllRoomServlet")
public class GetAllRoomServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllRoomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destination= "/Home.jsp";
        GetAllRoomsBO getAllRoomsBO = new GetAllRoomsBO();
        ArrayList<Room> rooms = getAllRoomsBO.Get_Room_List();
        request.setAttribute("rooms",rooms);
        RequestDispatcher rd = (RequestDispatcher) getServletContext().getRequestDispatcher(destination);
        rd.forward(request,response);
    }


    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
