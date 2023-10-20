package com.example.demoapplication;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import users.DataUsers;
import users.User;

public class HelloController {
    @FXML
    private TextField loginTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    protected void enterButtonClick() {
        if(checkInputData()) {
            //вход в систему
            System.out.println("Добро пожаловать в систему!");
        }
        else {
            System.out.println("Неверные данные, попробуйте ещё");
        }
    }

    private boolean checkInputData() {
        for(User user : DataUsers.data) {
            if(loginTextField.getText().equals(user.getLogin())
                    && passwordTextField.getText().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}