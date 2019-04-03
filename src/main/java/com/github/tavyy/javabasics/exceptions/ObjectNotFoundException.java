package com.github.tavyy.javabasics.exceptions;

import static com.github.tavyy.javabasics.exceptions.ExceptionRule.OBJECT_NOT_FOUND;

public class ObjectNotFoundException extends ApplicationException {

    public ObjectNotFoundException(String message) {
        super(OBJECT_NOT_FOUND, message);
    }

    public ObjectNotFoundException(Throwable cause, String message) {
        super(cause, OBJECT_NOT_FOUND, message);
    }
}
