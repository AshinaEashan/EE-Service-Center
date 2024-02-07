package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.io.IOException;

public class EmployeeController {
    public BorderPane employeePane;
    @FXML
    private JFXButton updateBtn;

    @FXML
    private JFXButton addEmployeeBtn;

    @FXML
    private JFXTextField employeeSearchField;

    @FXML
    private JFXButton searchBtn;

    @FXML
    private JFXButton homeBtn;

    @FXML
    private JFXButton itemBtn;

    @FXML
    private JFXButton customerBtn;

    @FXML
    private JFXButton ordersBtn;

    @FXML
    private JFXButton employeeBtn;

    @FXML
    private ImageView userBtn;

    @FXML
    void customerBtn(ActionEvent event) {
        Stage stage = (Stage) employeePane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CustomerFrame.fxml"))));
            stage.centerOnScreen();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void employeeBtn(ActionEvent event) {
        Stage stage = (Stage) employeePane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployeeFrame.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void homeBtn(ActionEvent event) {
        Stage stage = (Stage) employeePane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void itemBtn(ActionEvent event) {
        Stage stage = (Stage) employeePane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ItemFrame.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void ordersBtn(ActionEvent event) {
        Stage stage = (Stage) employeePane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrdersFrame.fxml"))));
            stage.centerOnScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
