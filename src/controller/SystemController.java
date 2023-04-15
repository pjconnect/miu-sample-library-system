package controller;

import data.DataFacade;
import data.User;

import javax.swing.*;

public class SystemController {

    private DataFacade df = DataFacade.getInstance();
    private User loggedInUser;

    public User Login(String txtUsername, String txtPassword) {
        // get all users
        for(User user: df.getUsers()){
            if(user.username.equals(txtUsername) && user.password.equals(txtPassword)){
                loggedInUser = user;
                break;
            }
        }

        return loggedInUser;
    }

    public User getLoggedInUser(){
        return loggedInUser;
    }
}
