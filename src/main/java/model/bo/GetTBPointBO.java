package model.bo;
import model.bean.*;
import model.dao.*;
import java.util.ArrayList;
public class GetTBPointBO {
    GetTablePointDAO getTablePointDAO = new GetTablePointDAO();
    public ArrayList<TablePoint> GetTBPByMSSV(int mssv) {return getTablePointDAO.GetTBPointByMSSV(mssv);}
}
