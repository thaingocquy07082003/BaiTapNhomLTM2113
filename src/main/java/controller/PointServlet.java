package controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import model.bo.*;
import model.bean.*;
@WebServlet("/PointServlet")
public class PointServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destination= "/MyPoint.jsp";
        String username = request.getParameter("username");
        GetRoomByIDBO getRoomByIDBO = new GetRoomByIDBO();
        StudentManageBO studentManageBO = new StudentManageBO();
        GetTBPointBO getTBPointBO = new GetTBPointBO();

//        Room room = getRoomByIDBO.GetRoom(id_room);
//        request.setAttribute("room",room);
        int mssv = studentManageBO.GetMSSVByUsername(username);
        ArrayList<TablePoint> tbs = getTBPointBO.GetTBPByMSSV(mssv);
        ArrayList<StudentPoint> studentPoints = new ArrayList<>();
        for(TablePoint tb: tbs) {
            StudentPoint studentPoint = new StudentPoint(getRoomByIDBO.GetRoom(mssv).getName_room(),tb.getPoint_student());
            studentPoints.add(studentPoint);
        }

        request.setAttribute("username",username);
        request.setAttribute("studentPoints",studentPoints);
        RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher(destination);
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
