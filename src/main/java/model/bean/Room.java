package model.bean;

public class Room {
    private int id_room;
    private String name_room;
    private int time;
    private String room_pass;

    public String getRoom_pass() {
        return room_pass;
    }

    public void setRoom_pass(String room_pass) {
        this.room_pass = room_pass;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    public Room() {
    }

    public Room(int id_room, String name_room,int time, String room_pass) {
        this.id_room = id_room;
        this.name_room = name_room;
        this.time = time;
        this.room_pass = room_pass;
    }

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public String getName_room() {
        return name_room;
    }

    public void setName_room(String name_room) {
        this.name_room = name_room;
    }
}
