package com.es2.passwordgenerator;

public abstract class PasswordGeneratorFactory {
    PasswordGenerator getPasswordGenerator(String type){
        PasswordGenerator passGen = null;
        if (type.equalsIgnoreCase("Computer")) {
            //passGen = new Computer();
        } else if (type.equalsIgnoreCase("Software")) {
            //passGen = new Software();
        } else {
            //throw new UndefinedProductException();
        }
        return passGen;
    }
}
