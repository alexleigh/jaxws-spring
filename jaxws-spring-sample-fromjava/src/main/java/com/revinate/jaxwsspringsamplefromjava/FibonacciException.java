package com.revinate.jaxwsspringsamplefromjava;

public class FibonacciException extends Exception {

    private final String detail;

    public FibonacciException(String message, String detail) {
        super(message);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
