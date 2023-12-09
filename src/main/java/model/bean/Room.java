package model.bean;

public class Room {
    private int id_room;
    private String name_room;

    public Room() {
    }

    public Room(int id_room, String name_room) {
        this.id_room = id_room;
        this.name_room = name_room;
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
