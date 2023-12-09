package model.bean;

public class Student {
    private int mssv;
    private String name_student;
    private String username;

    public Student() {
    }

    public Student(int mssv, String name_student, String username) {
        this.mssv = mssv;
        this.name_student = name_student;
        this.username = username;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName_student() {
        return name_student;
    }

    public void setName_student(String name_student) {
        this.name_student = name_student;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
