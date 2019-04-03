package com.github.tavyy.javabasics.exceptions;

public class NotAllowedException extends ApplicationException {

    public NotAllowedException(String message) {
        super(ExceptionRule.NOT_ALLOWED, message);
    }

    public NotAllowedException(String message, Throwable cause) {
        super(cause, ExceptionRule.NOT_ALLOWED, message);
    }

}
