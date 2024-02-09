package controller;

import bo.custom.CustomerBo;
import bo.custom.impl.CustomerBoImpl;
import com.jfoenix.controls.JFXTextField;
import dto.CustomerDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

import static controller.CustomerController.newData;

public class CustomerUpdateFormController {

    @FXML
    private JFXTextField idTxt;
    @FXML
    private JFXTextField nameTxt;
    @FXML
    private JFXTextField phoneNUmberTxt;
    @FXML
    private JFXTextField emailTxt;

    private CustomerBo customerBo = new CustomerBoImpl();

    public void initialize(){
        setData();
        idTxt.setEditable(false);
    }

    @FXML
    private void saveBtn(ActionEvent actionEvent) {
        CustomerDto dto = new CustomerDto(
                Long.parseLong(idTxt.getText()),
                nameTxt.getText(),
                phoneNUmberTxt.getText(),
                emailTxt.getText()
        );


            boolean isUpdated = customerBo.updateCustomer(dto);
            if (isUpdated){
                new Alert(Alert.AlertType.INFORMATION,"Customer "+dto.getId()+" Updated!").show();
                reload();
            }

    }
    private void reload() {
        nameTxt.clear();
        emailTxt.clear();
        phoneNUmberTxt.clear();
    }
    public void setData(){

        idTxt.setText(String.valueOf(newData.getId()));
        nameTxt.setText(newData.getName());
        emailTxt.setText(newData.getEmail());
        phoneNUmberTxt.setText(newData.getPhoneNumber());



    }
}
