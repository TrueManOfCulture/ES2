package com.es2.decorator;

public class TwoFactorAuthDecorator extends PasswordManagerDecorator {
    public TwoFactorAuthDecorator(PasswordManager wrapped) {
        super(wrapped);
    }

    @Override
    public void accessCredentials(String category) {
        // Lógica extra antes
        System.out.println("Enviando código de 2FA...");
        // Poderia integrar SMS, email, app, etc.

        super.accessCredentials(category);

        // Lógica extra depois (se necessário)
        System.out.println("Autenticação 2FA concluída.");
    }
}

