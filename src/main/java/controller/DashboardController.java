package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {
    public BorderPane dashboardPane;
    @FXML
    private JFXButton homeBtn;

    @FXML
    private JFXButton itemBtn;

    @FXML
    private JFXButton customerBtn;

    @FXML
    private JFXButton orderBtn;

    @FXML
    private JFXButton employeeBtn;

    @FXML
    private JFXButton userBtn;

    @FXML
    private JFXButton addCustomerBtn;

    @FXML
    private JFXButton addItemBtn;

    @FXML
    private JFXButton addEmployeeBtn;

    @FXML
    private JFXButton placeOrderBtn;

    @FXML
    private JFXButton pendingOrdersBtn;

    @FXML
    private JFXButton completedOrdersBtn;

    @FXML
    void completedOrdersBtn(ActionEvent event) {

    }

    @FXML
    void customerBtn(ActionEvent event) {
        Stage stage = (Stage) dashboardPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CustomerFrame.fxml"))));
            stage.centerOnScreen();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void employeeBtn(ActionEvent event) {
        Stage stage = (Stage) dashboardPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployeeFrame.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void homeBtn(ActionEvent event) {
        Stage stage = (Stage) dashboardPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void itemBtn(ActionEvent event) {
        Stage stage = (Stage) dashboardPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ItemFrame.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void orderBtn(ActionEvent event) {
        Stage stage = (Stage) dashboardPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrdersFrame.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void pendingOrdersBtn(ActionEvent event) {

    }

    @FXML
    void userBtn(ActionEvent event) {

    }
}
