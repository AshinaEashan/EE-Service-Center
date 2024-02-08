package dao.custom.Impl;

import dao.custom.OrderDetailsDao;
import entity.OrderDetails;

import java.util.List;

public class OrderDetailsDaoImpl implements OrderDetailsDao {
    @Override
    public boolean save(OrderDetails entity) {
        return false;
    }

    @Override
    public boolean update(OrderDetails entity) {
        return false;
    }

    @Override
    public boolean delete(String value) {
        return false;
    }

    @Override
    public List<OrderDetails> getAll() {
        return null;
    }
}
