package com.github.tavyy.javabasics.exceptions;

import static com.github.tavyy.javabasics.exceptions.ExceptionRule.MISSING_INPUT_DATA;

public class MissingInputDataException extends ApplicationException {

    public MissingInputDataException(String message) {
        super(MISSING_INPUT_DATA, message);
    }

    public MissingInputDataException(Throwable cause, String message) {
        super(cause, MISSING_INPUT_DATA, message);
    }
}
