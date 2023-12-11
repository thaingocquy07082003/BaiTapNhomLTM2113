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
@WebServlet("/ResultServlet")
public class ProcessingResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private  ExecutorService executorService = Executors.newSingleThreadExecutor();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GetQuestionBO getQuestionBO = new GetQuestionBO();
        int id_room = Integer.parseInt(request.getParameter("id_room"));
//        ArrayList<Question> questions = getQuestionBO.GetQuestion(id_room);
//        ArrayList<Integer> answer = new ArrayList<Integer>();
//        for(Question question : questions){
//            answer.add(question.getId_result());
//        }
        int size = getQuestionBO.GetQuestion(id_room).size();
        ArrayList<String> answers = new ArrayList<String>();
        for(int i = 0; i< size;i++) {
            answers.add(request.getParameter("option"+i));
        }

        ArrayList<Integer> answer_int = new ArrayList<Integer>();
        for(String answer : answers){
            answer_int.add(Integer.parseInt(answer));
        }
        // Lấy dữ liệu từ form (ví dụ: câu trả lời) từ request.getParameter("answer")
        // Thêm công việc vào hàng đợi để xử lý
        Runnable task = new AnswerProcessingTask(answer_int, request, response);
        executorService.execute(task);
        response.sendRedirect("Result.jsp");
    }

    @Override
    public void destroy() {
        // Đảm bảo dừng ExecutorService khi Servlet kết thúc
        executorService.shutdown();
    }
}
