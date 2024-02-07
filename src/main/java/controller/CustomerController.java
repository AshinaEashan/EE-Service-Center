package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerController {

    public BorderPane customerPane;

    public void deleteBtn(ActionEvent actionEvent) {

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
}
