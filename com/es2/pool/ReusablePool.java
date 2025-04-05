package com.es2.pool;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ReusablePool extends Object{

    private static ReusablePool instance;

    private HttpURLConnection conec;
    private URL url;
    private int size, created;
    private ArrayList free, used;

    private ReusablePool() throws MalformedURLException {
        free = new ArrayList();
        used = new ArrayList();
        created = 0;
        setMaxPoolSize(10);
        url = new URL("http://example.com");
    }

    public static ReusablePool getInstance() throws MalformedURLException {
        if (instance == null) {
            instance = new ReusablePool();
        }
        return instance;
    }

    public synchronized HttpURLConnection acquire() throws IOException, PoolExhaustedException {
        System.out.printf("Used acquired, amount of free is %d\n", free.size());
        if(free.isEmpty() && created<size){
            free.add((HttpURLConnection) url.openConnection());
            created++;
            System.out.printf("The amount of created is %d and the max size is %d\n", created, size);
        }else if(free.isEmpty() && created==size){
            System.out.printf("Error! The amount created is %d and the max size is %d\n", created, size);
            throw new PoolExhaustedException();
        }
        HttpURLConnection conn = (HttpURLConnection) free.remove(free.size()-1);
        used.add(conn);
        return conn;
    }

    public synchronized void release(HttpURLConnection conn) throws ObjectNotFoundException{
        System.out.println("Used release");
        if (conn == null || !used.contains(conn)) {
            throw new ObjectNotFoundException();
        }
        used.remove(conn);
        free.add(conn);
    }

    public synchronized void resetPool(){
        free.clear();
        used.clear();
        created = 0;
    }

    public synchronized void setMaxPoolSize(int size){
        System.out.printf("The new size is %d\n", size);
        this.size = size;
    }
}
