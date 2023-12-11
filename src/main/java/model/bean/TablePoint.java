package model.bean;
public class TablePoint {
    private int id_room ;
    private int mssv ;
    private double point_student;

    public TablePoint() {
    }

    public TablePoint(int id_room, int mssv, double point_student) {
        this.id_room = id_room;
        this.mssv = mssv;
        this.point_student = point_student;
    }

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public double getPoint_student() {
        return point_student;
    }

    public void setPoint_student(double point_student) {
        this.point_student = point_student;
    }
}
