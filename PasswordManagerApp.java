import com.es2.passwordgenerator.*;

public class PasswordManagerApp {
    public static void main(String[] args) {
        // Singleton
        CentralRegistry config = CentralRegistry.getInstance();
        System.out.println("App Name: " + config.getAppName());

        // Factory Method
        PasswordGenerator generator = PasswordGeneratorFactory.getPasswordGenerator("gttt");
        String password = generator.generatePassword();
        System.out.println("Generated Password: " + password);


        /*// Bridge
        Storage storage = new LocalFileStorage();
        StorageManager storageManager = new StorageManager(storage);
        storageManager.savePassword(password);

        // Composite
        Category workCategory = new Category("Work");
        workCategory.addComponent(new Password("Email Password"));
        workCategory.addComponent(new Password("Database Password"));
        workCategory.display();

        // Object Pool
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
        connection.connect();
        pool.releaseConnection(connection);

        // Memento
        Application app = new Application();
        app.setLastPassword("LastUsedPassword123");
        ApplicationState savedState = app.saveState();
        app.restoreState(savedState);

        // Decorator
        PasswordService passwordService = new MultiFactorAuthDecorator(new BasicPasswordService());
        passwordService.savePassword("SecurePassword123");*/
    }
}
