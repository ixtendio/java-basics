package com.github.tavyy.javabasics.exceptions;

import static com.github.tavyy.javabasics.exceptions.ExceptionRule.MALFORMED_RESPONSE;

public class MalformedApiResponseException extends ApplicationException {

    public MalformedApiResponseException(String message) {
        super(MALFORMED_RESPONSE, message);
    }

    public MalformedApiResponseException(Throwable cause, String message) {
        super(cause, MALFORMED_RESPONSE, message);
    }
}
