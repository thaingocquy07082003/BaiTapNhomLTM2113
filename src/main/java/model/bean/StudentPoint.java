package model.bean;
public class StudentPoint {
    private String name_room;
    private double point_student;

    public StudentPoint(String name_room, double point_student) {
        this.name_room = name_room;
        this.point_student = point_student;
    }

    public String getName_room() {
        return name_room;
    }

    public void setName_room(String name_room) {
        this.name_room = name_room;
    }

    public double getPoint_student() {
        return point_student;
    }

    public void setPoint_student(double point_student) {
        this.point_student = point_student;
    }
}
