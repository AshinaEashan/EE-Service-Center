package dao.custom.Impl;

import dao.custom.OrdersDao;
import entity.Orders;

import java.util.List;

public class OrdersDaoImpl implements OrdersDao {
    @Override
    public boolean save(Orders entity) {
        return false;
    }

    @Override
    public boolean update(Orders entity) {
        return false;
    }

    @Override
    public boolean delete(String value) {
        return false;
    }

    @Override
    public List<Orders> getAll() {
        return null;
    }
}
