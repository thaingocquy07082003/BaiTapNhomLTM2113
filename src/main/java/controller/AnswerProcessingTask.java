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
    private ArrayList<Integer> answer;
    private HttpServletRequest request;
    private HttpServletResponse response;

    public AnswerProcessingTask(ArrayList<Integer> answer, HttpServletRequest request, HttpServletResponse response) {
        this.answer = answer;
        this.request = request;
        this.response = response;
    }

    @Override
    public void run() {
        // Xử lý câu trả lời ở đây, có thể làm bất kỳ điều gì với câu trả lời như lưu vào cơ sở dữ liệu, kiểm tra đúng/sai, vv.
        int id_room = Integer.parseInt(request.getParameter("id_room"));
        String username = request.getParameter("username");
        GetQuestionBO getQuestionBO = new GetQuestionBO();
        GetRoomByIDBO getRoomByIDBO = new GetRoomByIDBO();
        AddPointBO addPointBO = new AddPointBO();
        StudentManageBO studentManageBO = new StudentManageBO();


        ArrayList<Question> questions = getQuestionBO.GetQuestion(id_room);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(Question question : questions){
            result.add(question.getId_result());
        }

        int total_correct = 0;
        for(int i = 0; i< result.size();i++)
        {
            if(result.get(i).equals(answer.get(i))) {
                total_correct +=1;
            }
        }
        // Xử lý các công việc khác...
        double point = (double) total_correct  / questions.size() ;
        double decimalPart = (double) ((int) (point * 100)) / 10;
        addPointBO.AddPoint(id_room,studentManageBO.GetMSSVByUsername(username), decimalPart );
        // Set dữ liệu cần hiển thị trên trang JSP vào attribute của request
        request.setAttribute("correct", total_correct);
        request.setAttribute("total_question",questions.size());
        request.setAttribute("username",username);
        request.setAttribute("name_room",getRoomByIDBO.GetRoom(id_room).getName_room());

        // Chuyển hướng (forward) yêu cầu tới trang JSP để hiển thị kết quả
        RequestDispatcher rd = request.getRequestDispatcher("/Result.jsp");
        try {
            rd.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
