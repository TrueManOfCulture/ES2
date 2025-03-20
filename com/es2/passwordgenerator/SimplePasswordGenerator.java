package com.es2.passwordgenerator;

import java.util.Random;

//Classe responsável por criar passwords simples
public class SimplePasswordGenerator implements PasswordGenerator{

    SimplePasswordGenerator(){
    }

    //Create a password with 4 numberical digits
    @Override
    public String generatePassword() {
        Random random = new Random();
        String password = String.valueOf(random.nextInt(9000)+1000);
        return password;
    }
}
