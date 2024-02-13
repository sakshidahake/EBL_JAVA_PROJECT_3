package com.wecp.progressive.exception;

public class CustomerAlreadyExistsException extends RuntimeException {
    public CustomerAlreadyExistsException(String m) {
        super(m);
    }
}