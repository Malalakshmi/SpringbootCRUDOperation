package com.learningTech.SpringbootCrudOperation.error;

public class Department01NotFoundException extends Exception{
    public Department01NotFoundException() {
        super();
    }

    public Department01NotFoundException(String message) {
        super(message);
    }

    public Department01NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public Department01NotFoundException(Throwable cause) {
        super(cause);
    }

    protected Department01NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
