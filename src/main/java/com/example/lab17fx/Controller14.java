package com.example.lab17fx;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller14 {
    @FXML
    private Button calc;

    @FXML
    private Button clear;

    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;

    @FXML
    private TextField TextField3;

    @FXML
    public void clickCalc(ActionEvent e) {
        try {
            int a = Integer.parseInt(TextField1.getText());
            int b = Integer.parseInt(TextField2.getText());
            int sum = a + b;
            TextField3.setText(Integer.toString(sum));
        } catch (NumberFormatException ne) {
            TextField3.setText("error");
        }
    }
    @FXML
    public void clickClear(ActionEvent e) {
        TextField1.setText("");
        TextField2.setText("");
        TextField3.setText("");
    }
}