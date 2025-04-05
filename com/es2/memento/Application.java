package com.es2.memento;

import java.util.ArrayList;

public class Application extends Object{
    private String password;


    public Application(){
    }

    public void setLastPassword(String password){
        this.password = password;
    }

    public ApplicationState saveState(){
        return new ApplicationState(password);
    }

    public void restoreState(ApplicationState state){
        this.password = state.getState();
    }
}
