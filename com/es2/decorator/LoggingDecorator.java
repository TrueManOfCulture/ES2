package com.es2.decorator;

public class LoggingDecorator extends PasswordManagerDecorator {
    public LoggingDecorator(PasswordManager wrapped) {
        super(wrapped);
    }

    @Override
    public void accessCredentials(String category) {
        System.out.println("[LOG] Acesso solicitado para: " + category);
        super.accessCredentials(category);
    }
}