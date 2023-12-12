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
@WebServlet("/RoomPasswordServlet")
public class RoomPasswordServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destination= "/Room.jsp";
        int id_room = Integer.parseInt(request.getParameter("id_room"));
        String username = request.getParameter("username");
        GetRoomByIDBO getRoomByIDBO = new GetRoomByIDBO();
        Room room = getRoomByIDBO.GetRoom(id_room);
        request.setAttribute("room",room);
        request.setAttribute("username",username);
        RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher(destination);
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
