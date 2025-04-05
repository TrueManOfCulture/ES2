package com.es2.pool;

import java.io.Serializable;

public class ObjectNotFoundException extends Exception implements Serializable {
    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(){
        super();
    }
}
