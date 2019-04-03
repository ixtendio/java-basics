package com.github.tavyy.javabasics.exceptions;

import static com.github.tavyy.javabasics.exceptions.ExceptionRule.INVALID_INPUT_DATA;

public class InvalidInputDataException extends ApplicationException {

    public InvalidInputDataException(String message) {
        super(INVALID_INPUT_DATA, message);
    }

    public InvalidInputDataException(Throwable cause, String message) {
        super(cause, INVALID_INPUT_DATA, message);
    }
}
