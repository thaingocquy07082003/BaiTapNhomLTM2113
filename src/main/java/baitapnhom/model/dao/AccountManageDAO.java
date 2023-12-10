package baitapnhom.model.dao;

import baitapnhom.model.bean.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountManageDAO {

    Connection conn = null;
    PreparedStatement ps= null;
    ResultSet rs= null;
    public List<Account> getAccountList()
    {
        List<Account> list = new ArrayList<>();
        String query = "select*from accounts";
        try{
            conn= new DBHelper().getConnection();//mo ket noi vs sql
            ps=conn.prepareStatement(query);
            rs= ps.executeQuery();
            while (rs.next())
            {
                list.add(new Account(rs.getString(0), rs.getString(1),rs.getInt(2) ));
            }

        } catch (Exception e) {

        }
        return list;
    }

    public static void main(String[] args) {
        AccountManageDAO dao = new AccountManageDAO();
        List<Account> list = dao.getAccountList();
        for(Account account:list)
        {
            System.out.println(account);
        }
    }
}
