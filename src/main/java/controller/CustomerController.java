package controller;

import bo.custom.CustomerBo;
import bo.custom.impl.CustomerBoImpl;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.sun.javafx.collections.ImmutableObservableList;
import dao.custom.CustomerDao;
import dao.custom.Impl.CustomerDaoImpl;
import dto.CustomerDto;
import dto.tm.CustomerTm;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.List;

public class CustomerController {

    public BorderPane customerPane;
    public JFXButton updateBtn;
    public JFXButton deleteBtn;
    public JFXButton addCustomerBtn;
    public JFXTextField customerSearchField;
    public JFXButton searchBtn;
    public TableView<CustomerTm> customerTbl;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colPhoneNumber;
    public TableColumn colEmail;
    public TableColumn colOption;
    public JFXTextField idTxt;
    public JFXTextField nameTxt;
    public JFXTextField phoneNUmberTxt;
    public JFXTextField emailTxt;


    private CustomerBo customerBo = new CustomerBoImpl();
    public static CustomerDto newData;
    private FilteredList<CustomerTm> filteredData;


    public void initialize(){
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colOption.setCellValueFactory(new PropertyValueFactory<>("btn"));

        loadCustomerTbl();


        customerTbl.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            setData( newValue);
        });

        customerSearchField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
                filteredData.setPredicate(customer -> {
                    if (newValue == null || newValue.isEmpty()) {
                        return true;
                    }
                    String lowerCaseFilter = newValue.toLowerCase();

                    return customer.getName().toLowerCase().contains(lowerCaseFilter)
                            || customer.getPhoneNumber().toLowerCase().contains(lowerCaseFilter)
                            || customer.getEmail().toLowerCase().contains(lowerCaseFilter);
                });
            }
        });
    }

    private void setData(CustomerTm newValue) {
        if (newValue != null) {

            newData =new CustomerDto(
                    newValue.getId(),
                    newValue.getName(),
                    newValue.getPhoneNumber(),
                    newValue.getEmail()
            );

        }
    }

    private void loadCustomerTbl() {
        ObservableList<CustomerTm> tmList = FXCollections.observableArrayList();

        List<CustomerDto> customerDtos = customerBo.allCustomer();
        for (CustomerDto customer:customerDtos ) {
            Button btn = new Button("Delete");


            btn.setOnAction(ActionEvent ->{
                    deleteCustomer(customer.getId());

            } );
            CustomerTm customerTm = new CustomerTm(
                    customer.getId(),
                    customer.getName(),
                    customer.getPhoneNumber(),
                    customer.getEmail(),
                    btn
            );

            tmList.add(customerTm);
        }
        customerTbl.setItems(tmList);
    }

    private void deleteCustomer(Long id) {
        boolean isDeleted = customerBo.deleteCustomer(String.valueOf(id));
        if (isDeleted){
            new Alert(Alert.AlertType.INFORMATION,"Customer Deleted!").show();
            loadCustomerTbl();
        }else{
            new Alert(Alert.AlertType.ERROR,"Something went wrong!").show();
        }
    }


    @FXML
    void customerBtn(ActionEvent event) {
        Stage stage = (Stage) customerPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CustomerFrame.fxml"))));
            stage.centerOnScreen();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void employeeBtn(ActionEvent event) {
        Stage stage = (Stage) customerPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployeeFrame.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void homeBtn(ActionEvent event) {
        Stage stage = (Stage) customerPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void itemBtn(ActionEvent event) {
        Stage stage = (Stage) customerPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ItemFrame.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void ordersBtn(ActionEvent event) {
        Stage stage = (Stage) customerPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrdersFrame.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void addCustomerBtn(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/CustomerForm.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    private void reloadBtn(ActionEvent actionEvent) {
        customerTbl.refresh();
    }
    @FXML
    private void updateBtn(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/CustomerUpdateForm.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    




}
