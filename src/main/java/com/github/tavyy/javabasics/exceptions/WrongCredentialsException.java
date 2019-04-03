package com.github.tavyy.javabasics.exceptions;

import static com.github.tavyy.javabasics.exceptions.ExceptionRule.WRONG_CREDENTIALS;

public class WrongCredentialsException extends ApplicationException {

    public WrongCredentialsException() {
        super(WRONG_CREDENTIALS);
    }

    public WrongCredentialsException(Throwable cause) {
        super(cause, WRONG_CREDENTIALS);
    }
}
