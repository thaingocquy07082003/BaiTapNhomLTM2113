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
@WebServlet("/answerForm")
public class ProcessingResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy dữ liệu từ form (ví dụ: câu trả lời) từ request.getParameter("answer")
        String answer = request.getParameter("answer");

        // Thêm công việc vào hàng đợi để xử lý
        executorService.execute(new AnswerProcessingTask(answer, request, response));
    }

    @Override
    public void destroy() {
        // Đảm bảo dừng ExecutorService khi Servlet kết thúc
        executorService.shutdown();
    }
}
