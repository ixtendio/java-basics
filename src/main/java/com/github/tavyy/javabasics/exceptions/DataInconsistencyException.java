package com.github.tavyy.javabasics.exceptions;

import static com.github.tavyy.javabasics.exceptions.ExceptionRule.DATA_INCONSISTENCY;

public class DataInconsistencyException extends ApplicationException {

    public DataInconsistencyException() {
        super(DATA_INCONSISTENCY);
    }

    public DataInconsistencyException(Throwable cause) {
        super(cause, DATA_INCONSISTENCY);
    }
}
