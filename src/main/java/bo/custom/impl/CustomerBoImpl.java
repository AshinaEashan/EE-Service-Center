package bo.custom.impl;

import bo.custom.CustomerBo;
import dao.DaoFactory;
import dao.custom.CustomerDao;
import dao.util.DaoTypes;
import dto.CustomerDto;
import entity.Customer;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

public class CustomerBoImpl implements CustomerBo {
    private CustomerDao customerDao = DaoFactory.getInstance().getDao(DaoTypes.CUSTOMER);
    @Override
    public boolean saveCustomer(CustomerDto dto) {

        return customerDao.save(
               new Customer(
                       dto.getName(),
                       dto.getPhoneNUmber(),
                       dto.getEmail()
               )
        );
    }

    @Override
    public boolean updateCustomer(CustomerDto dto) {
        return customerDao.save(
                new Customer(
                        dto.getName(),
                        dto.getPhoneNUmber(),
                        dto.getEmail()
                )
        );
    }

    @Override
    public boolean deleteCustomer(String value) {
        return customerDao.delete(value);

    }

    @Override
    public List<CustomerDto> getAll() {
        List<Customer> entityList = customerDao.getAll();

        List<CustomerDto> customerList = new ArrayList<>();

        for (Customer customer:entityList ) {
            customerList.add(
                    new CustomerDto(
                            customer.getId(),
                            customer.getName(),
                            customer.getPhoneNumber(),
                            customer.getEmail()
                    )
            );
        }

        return customerList;
    }
}
