package controller;

import data.DataFacade;
import data.User;

import javax.swing.*;

public class SystemController {

    private DataFacade df = DataFacade.getInstance();
    private User loggedInUser;
    private static SystemController systemController;

    public static SystemController getInstance(){
        if(systemController == null){
           systemController = new SystemController();
        }
        return systemController;
    }

    private SystemController(){

    }



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

    public void logOut() {
        loggedInUser = null;
    }
}
