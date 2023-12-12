package model.dao;
import model.bean.Account;
import model.bean.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountManageDAO {
    public ArrayList<Account> getAllAccount() {
        ArrayList<Account> result = new ArrayList<Account>();

        // Connect to database
        try {
            Connection con = new DBHelper().getConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from accounts";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Account account= new Account(rs.getString("username"),rs.getString("password"),rs.getInt("id_role"));
                result.add(account);
            }

        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Error:  " + e);
        }

        return result;
    }
    public void insert( String username, String password) {
        String sql = "INSERT INTO accounts VALUES('"+username+"','"+password+"','1')";
        try {
            Connection con = new DBHelper().getConnection();
            PreparedStatement p = con.prepareStatement(sql);
            p.executeUpdate();
            p.close();
        } catch (Exception e) {

        }
    }
    public ArrayList<String> getUsername() {
        ArrayList<String> p = new ArrayList<String>();
        ArrayList<Account> list = getAllAccount();
        for (Account account : list) {
            p.add(account.getUsername());

        }

        return p;
    }
    public Account getAccount(String username) {
        ArrayList<Account> list = getAllAccount();
        Account a = new Account();
        for (Account account : list) {
            if (account.getUsername().equals(username)) {
                a = account;
            }
        }
        return a;
    }
    public Account getAccountbyUserPass(String user, String pass) {
        String query = "SELECT * FROM accounts where username=? and password=?";
        try {
            Connection con = new DBHelper().getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,pass);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                return new Account(rs.getString("username"), rs.getString("password"), rs.getInt("id_role"));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    public void Update(String username , String password)
    {
        try
        {
//            String url = "jdbc:mysql://localhost:3307/dulieu";
//            Connection con = DriverManager.getConnection(url, "root", "");
//            Statement stmt = con.createStatement();
//            String sql = "UPDATE admin SET ID='"+account.get_ID()+"', username='"+account.get_username()+"',password='"+account.get_password()+"'  WHERE id ='"+account.get_ID()+"'";
//            stmt.executeUpdate(sql);
//            stmt.close();
            String url = "jdbc:mysql://localhost:3307/check_result";
            Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement stmt = con.prepareStatement("UPDATE accounts SET username = ?, password = ?, id_role = 1 WHERE username = ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, username);
            stmt.executeUpdate();
            stmt.close();
        }
        catch(Exception f)
        {
            System.out.println("Error "+ f);
        }
    }


    public static void main(String[] args) {
        AccountManageDAO dao = new AccountManageDAO();
        dao.insert("thuthithi","345");
        List<Account> accounts = dao.getAllAccount();
        for(Account account:accounts)
        {
            System.out.println(account);
        }
        ArrayList<String> p = dao.getUsername();

        System.out.println(p);
        System.out.println(dao.getAccountbyUserPass("thuhoa123","123").getId_role());

    }

}
