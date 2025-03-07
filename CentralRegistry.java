public class CentralRegistry extends Object{
    private static CentralRegistry instance;
    private String path;
    private String connectionString;

    private CentralRegistry(){

    }

    public static CentralRegistry getInstance(){
        if (instance == null) {
            instance = new CentralRegistry();
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
