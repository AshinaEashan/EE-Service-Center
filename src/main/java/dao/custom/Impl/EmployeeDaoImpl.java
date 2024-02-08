package dao.custom.Impl;

import dao.custom.EmployeeDao;
import entity.Employee;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public boolean save(Employee entity) {
        return false;
    }

    @Override
    public boolean update(Employee entity) {
        return false;
    }

    @Override
    public boolean delete(String value) {
        return false;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }
}
