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
public class AnswerProcessingTask implements Runnable {
    private String answer;
    private HttpServletRequest request;
    private HttpServletResponse response;

    public AnswerProcessingTask(String answer, HttpServletRequest request, HttpServletResponse response) {
        this.answer = answer;
        this.request = request;
        this.response = response;
    }

    @Override
    public void run() {
        // Xử lý câu trả lời ở đây, có thể làm bất kỳ điều gì với câu trả lời như lưu vào cơ sở dữ liệu, kiểm tra đúng/sai, vv.
        // Ví dụ đơn giản: in ra console và trả về kết quả
        System.out.println("Processing answer: " + answer);

        // Xử lý các công việc khác...

        // Set dữ liệu cần hiển thị trên trang JSP vào attribute của request
        request.setAttribute("result", "Kết quả xử lý: " + answer);

        // Chuyển hướng (forward) yêu cầu tới trang JSP để hiển thị kết quả
        try {
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
