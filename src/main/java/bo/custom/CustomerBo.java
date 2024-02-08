package bo.custom;

import bo.SuperBo;
import dto.CustomerDto;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface CustomerBo extends SuperBo {
    boolean saveCustomer (CustomerDto dto);
    boolean updateCustomer (CustomerDto dto);
    boolean deleteCustomer (String value);
    List<CustomerDto> getAll();
}
