import com.es2.decorator.BasicPasswordManager;
import com.es2.decorator.LoggingDecorator;
import com.es2.decorator.PasswordManager;
import com.es2.decorator.TwoFactorAuthDecorator;
import com.es2.memento.Application;
import com.es2.memento.ApplicationState;
import com.es2.passwordgenerator.*;
import com.es2.pool.ObjectNotFoundException;
import com.es2.pool.PoolExhaustedException;
import com.es2.pool.ReusablePool;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class PasswordManagerApp {
    public static void main(String[] args) throws IOException, PoolExhaustedException, ObjectNotFoundException {
        // Singleton
        /*CentralRegistry config = CentralRegistry.getInstance();
        System.out.println("App Name: " + config.getAppName());

        // Factory Method
        PasswordGenerator generator = PasswordGeneratorFactory.getPasswordGenerator("complex");
        String password = generator.generatePassword();
        System.out.println("Generated Password: " + password);


        // Bridge
        Storage storage = new LocalFileStorage();
        StorageManager storageManager = new StorageManager(storage);
        storageManager.savePassword(password);

         Composite
        Category workCategory = new Category("Work");
        workCategory.addComponent(new Password("Email Password"));
        workCategory.addComponent(new Password("Database Password"));
        workCategory.display();

        ReusablePool pool = ReusablePool.getInstance();
        HttpURLConnection connection = pool.acquire();
        connection.connect();
        pool.release(connection);

        //Memento
        Application app = new Application();
        app.setLastPassword("LastUsedPassword123");
        ApplicationState savedState = app.saveState();
        app.restoreState(savedState);*/

        // Decorator
        PasswordManager passwordService = new TwoFactorAuthDecorator(new BasicPasswordManager());
        passwordService.accessCredentials("Escola");
        System.out.println("\n");
        passwordService = new LoggingDecorator(new TwoFactorAuthDecorator(new BasicPasswordManager()));
        passwordService.accessCredentials("Escola");
    }
}
