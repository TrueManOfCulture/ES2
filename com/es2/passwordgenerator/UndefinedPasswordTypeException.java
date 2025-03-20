package com.es2.passwordgenerator;

public class UndefinedPasswordTypeException extends RuntimeException {
    public UndefinedPasswordTypeException(String message) {
        super(message);
    }

    public UndefinedPasswordTypeException(){
        super();
    }
}
