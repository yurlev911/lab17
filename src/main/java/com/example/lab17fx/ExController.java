package com.example.lab17fx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;

public class ExController {

    @FXML
    private Label buttonsLabel;

    @FXML
    private void clickButton1(ActionEvent eventOne){ buttonsLabel.setText("Clicked Button1");}
    @FXML
    private void clickButton2(ActionEvent eventTwo){ buttonsLabel.setText("Clicked Button2");}
    @FXML
    private void clickButton3(ActionEvent eventThree){ buttonsLabel.setText("Clicked Button3");}
}
