package com.friska.math.linalg;

public class IncompatibleMatrixException extends RuntimeException{
    public IncompatibleMatrixException(String msg){
        super("An error occurred trying to process a vector or matrix. " + msg);
    }
}
