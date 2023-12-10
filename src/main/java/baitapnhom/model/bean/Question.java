package baitapnhom.model.bean;

public class Question {
   private int id_question ;
   private String question ;

    private int id_answer ;
    private int id_result;

    public Question() {
    }

    public Question(int id_question, String question, int id_answer, int id_result) {
        this.id_question = id_question;
        this.question = question;
        this.id_answer = id_answer;
        this.id_result = id_result;
    }

    public int getId_question() {
        return id_question;
    }

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getId_answer() {
        return id_answer;
    }

    public void setId_answer(int id_answer) {
        this.id_answer = id_answer;
    }

    public int getId_result() {
        return id_result;
    }

    public void setId_result(int id_result) {
        this.id_result = id_result;
    }
}
