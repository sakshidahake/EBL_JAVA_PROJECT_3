package com.wecp.progressive.exception;

public class OutOfBalanceException extends RuntimeException {
    public OutOfBalanceException(String m) {
        super(m);
    }
}