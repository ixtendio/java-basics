package com.github.tavyy.javabasics.exceptions;

import static com.github.tavyy.javabasics.exceptions.ExceptionRule.INSUFFICIENT_PRIVILEGES;

public class InsufficientPrivilegesException extends ApplicationException {

    public InsufficientPrivilegesException() {
        super(INSUFFICIENT_PRIVILEGES);
    }

    public InsufficientPrivilegesException(Throwable cause) {
        super(cause, INSUFFICIENT_PRIVILEGES);
    }
}
