package controller;

import model.bean.Student;
import model.bean.TablePoint;
import model.bo.StudentManageBO;
import model.bo.TablePointManageBO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/StudentServlet")

public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public StudentServlet() {
    }

    StudentManageBO bo = new StudentManageBO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Student> students = bo.getAllStudent();
        request.setAttribute("students", students);

        // Chuyển hướng tới trang JSP để hiển thị thông tin sinh viên
        request.getRequestDispatcher("/ShowStudent.jsp").forward(request,response);
    }

}

