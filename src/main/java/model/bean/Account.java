package model.bean;

public class Account {
    private String username;
    private String password;
    private int id_role;

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }


    public Account() {
    }

    public Account(String username, String password, int id_role) {
        this.username = username;
        this.password = password;
        this.id_role= id_role;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
