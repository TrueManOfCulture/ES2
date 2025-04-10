package com.es2.decorator;

public class NotificationDecorator extends PasswordManagerDecorator {
    public NotificationDecorator(PasswordManager wrapped) {
        super(wrapped);
    }

    @Override
    public void accessCredentials(String category) {
        super.accessCredentials(category);
        System.out.println("Enviando notificação de acesso à categoria: " + category);
    }
}
