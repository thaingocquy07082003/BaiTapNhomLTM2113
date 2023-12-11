package model.bo;

import model.bean.Account;
import model.dao.AccountManageDAO;

import java.util.ArrayList;

public class AccountManageBO {
    AccountManageDAO dao = new AccountManageDAO();
    public ArrayList<Account> getAllAccount() {
        return dao.getAllAccount();
    }
    public void insert(String username,String password)
    {
        dao.insert( username,password);
    }
    public ArrayList<String> getUsername() {
        return  dao.getUsername();
    }
    public Account getAccount(String username) {
        return dao.getAccount(username);
    }
    public Account getAccountbyUserPass(String user, String pass) {
        return dao.getAccountbyUserPass(user,pass);
    }
}
