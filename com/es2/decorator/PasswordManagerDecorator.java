package com.es2.decorator;

public class PasswordManagerDecorator implements PasswordManager {
    protected PasswordManager wrapped;

    public PasswordManagerDecorator(PasswordManager wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void accessCredentials(String category) {
        wrapped.accessCredentials(category);
    }
}