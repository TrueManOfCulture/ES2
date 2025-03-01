public class CentralRegistry extends Object{
    private static Registry instance;
    private String path;
    private String connectionString;

    private Registry(){

    }

    public static Registry getInstance(){
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }

    public String getPath(){
        return path;
    }

    public void setPath(String path){
        this.path = path;
    }

    public String getConnectionString(){
        return connectionString;
    }

    public void setConnectionString(String connectionString){
        this.connectionString = connectionString;
    }
}
