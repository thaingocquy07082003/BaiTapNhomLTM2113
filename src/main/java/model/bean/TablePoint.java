package model.bean;

public class TablePoint {
    private String name_room;
    private String username;
    private int mssv;
    private  String  name_student;
    private  double point_student;
    public TablePoint() {
    }

    @Override
    public String toString() {
        return "TablePoint{" +
                "name_room='" + name_room + '\'' +
                ", username='" + username + '\'' +
                ", mssv=" + mssv +
                ", name_student='" + name_student + '\'' +
                ", point_student=" + point_student +
                '}';
    }

    public String getName_room() {
        return name_room;
    }

    public void setName_room(String name_room) {
        this.name_room = name_room;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
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

    public double getPoint_student() {
        return point_student;
    }

    public void setPoint_student(double point_student) {
        this.point_student = point_student;
    }

    public TablePoint(String name_room, String username, int mssv, String name_student, double point_student) {
        this.name_room = name_room;
        this.username = username;
        this.mssv = mssv;
        this.name_student = name_student;
        this.point_student = point_student;
    }



}


