package dao.custom.Impl;

import dao.custom.ItemsDao;
import entity.Item;

import java.util.List;

public class ItemDaoImpl implements ItemsDao {
    @Override
    public boolean save(Item entity) {
        return false;
    }

    @Override
    public boolean update(Item entity) {
        return false;
    }

    @Override
    public boolean delete(String value) {
        return false;
    }

    @Override
    public List<Item> getAll() {
        return null;
    }
}
