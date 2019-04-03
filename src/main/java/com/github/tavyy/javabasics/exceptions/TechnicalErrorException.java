package com.github.tavyy.javabasics.exceptions;

import static com.github.tavyy.javabasics.exceptions.ExceptionRule.TECHNICAL_ERROR;

public class TechnicalErrorException extends ApplicationException {
    
    public TechnicalErrorException(String message) {
        super(TECHNICAL_ERROR, message);
    }

    public TechnicalErrorException(Throwable cause, String message) {
        super(cause, TECHNICAL_ERROR, message);
    }
}
