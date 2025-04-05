package com.es2.memento;

import java.util.ArrayList;

public class ApplicationState {

    String password;

    public ApplicationState(String password){
        this.password = password;
    }

    public String getState(){
        return password;
    }

}
