package com.es2.decorator;

public class BasicPasswordManager implements PasswordManager {
    @Override
    public void accessCredentials(String category) {
        System.out.println("Accessing credentials for: " + category);
    }
}