package com.es2.pool;

import java.io.Serializable;

public class PoolExhaustedException extends Exception implements Serializable {
    public PoolExhaustedException(String message) {
        super(message);
    }

    public PoolExhaustedException(){
        super();
    }
}
