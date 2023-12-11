package controller;

import model.bean.TablePoint;
import model.bo.TablePointManageBO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/TablePointServlet")
public class TablePointServlet extends HttpServlet {

        private static final long serialVersionUID = 1L;

    public TablePointServlet() {
    }

    TablePointManageBO bo = new TablePointManageBO();

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            List<TablePoint> tablePoints = bo.getAllTablePoint();
            request.setAttribute("tablePoints", tablePoints);

            // Chuyển hướng tới trang JSP để hiển thị thông tin sinh viên
            request.getRequestDispatcher("/ShowTablePoint.jsp").forward(request,response);
        }

}
