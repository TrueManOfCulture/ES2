package com.es2.passwordgenerator;

import java.util.Random;

public class ComplexPasswordGenerator implements PasswordGenerator{

    ComplexPasswordGenerator(){

    }

    @Override
    public String generatePassword() {
        // Define the characters to use in the password
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String password = ""; // Start with an empty string
        Random random = new Random();

        // Generate 12 random characters
            for (int i = 0; i < 12; i++) {
            int index = random.nextInt(characters.length());
            password += characters.charAt(index); // Concatenate each character
        }

        return password;
    }
}
