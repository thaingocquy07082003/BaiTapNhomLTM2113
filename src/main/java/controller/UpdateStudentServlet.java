package controller;

import model.bean.Student;
import model.bo.StudentManageBO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mssv = request.getParameter("mssv");
        String name_student = request.getParameter("name_student");
        String username = request.getParameter("username");
        StudentManageBO bo = new StudentManageBO();
        Student student= bo.getByMssv(Integer.parseInt(mssv));
        request.setAttribute("student",student);
        bo.update(Integer.parseInt(mssv),name_student,username);
//        ArrayList<Student> students = bo.getAllStudent();
//        request.setAttribute("students", students);

        request.getRequestDispatcher("/EditStudent.jsp").forward(request,response);
    }
}
