package model.bo;

import model.bean.TablePoint;
import model.dao.DBHelper;
import model.dao.TablePointManageDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TablePointManageBO {
    TablePointManageDAO dao = new TablePointManageDAO();
    public ArrayList<TablePoint> getAllTablePoint() {
        return dao.getAllTablePoint();
    }
}
