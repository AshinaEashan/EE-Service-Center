package controller;

import bo.custom.CustomerBo;
import bo.custom.impl.CustomerBoImpl;
import com.jfoenix.controls.JFXTextField;
import dto.CustomerDto;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class CustomerFormController {


    public JFXTextField nameTxt;
    public JFXTextField phoneNUmberTxt;
    public JFXTextField emailTxt;
    private CustomerBo customerBo = new CustomerBoImpl();

    public void saveBtn(ActionEvent actionEvent) {
        CustomerDto customer = new CustomerDto(
                nameTxt.getText(),
                phoneNUmberTxt.getText(),
                emailTxt.getText()
        );

        boolean isSaved = customerBo.saveCustomer(customer);
        if (isSaved){
            new Alert(Alert.AlertType.INFORMATION,"Customer Successfully Saved!").show();
            reload();
        }else{
            new Alert(Alert.AlertType.ERROR,"Something went wrong!").show();
        }

    }

    private void reload() {
        nameTxt.clear();
        emailTxt.clear();
        phoneNUmberTxt.clear();
    }
}
