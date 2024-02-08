package dao;

import dao.custom.Impl.CustomerDaoImpl;
import dao.util.DaoTypes;

public class DaoFactory {

    private static DaoFactory daoFactory;

    public DaoFactory(){

    }
    public static DaoFactory getInstance(){
        return daoFactory != null ? daoFactory : (daoFactory = new DaoFactory());
    }

    public  <T extends SuperDao>T getDao(DaoTypes type){
        switch (type){
            case CUSTOMER:
                return (T) new CustomerDaoImpl();
        }
        return null;
    }
}
