package com.es2.passwordgenerator;

public abstract class PasswordGeneratorFactory {

    PasswordGeneratorFactory(){

    }

    public static PasswordGenerator getPasswordGenerator(String type) throws UndefinedPasswordTypeException{
        PasswordGenerator passGen;
        if (type.equalsIgnoreCase("complex")) {
            passGen = new ComplexPasswordGenerator();
        } else if (type.equalsIgnoreCase("simple")) {
            passGen = new SimplePasswordGenerator();
        } else {
            throw new UndefinedPasswordTypeException();
        }
        return passGen;
    }
}
