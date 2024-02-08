package dao.custom.Impl;

import dao.custom.CustomerDao;
import dao.util.HibernateUtil;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public boolean save(Customer entity) {
//        Session session = HibernateUtil.getSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(entity);
//        transaction.commit();
//        session.close();
        return true;

    }

    @Override
    public boolean update(Customer entity) {
        return false;
    }

    @Override
    public boolean delete(String value) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("FROM Customer");
        List<Customer> list = query.list();
        return null;
    }
}
