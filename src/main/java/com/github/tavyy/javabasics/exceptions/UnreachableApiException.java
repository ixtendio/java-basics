package com.github.tavyy.javabasics.exceptions;

import static com.github.tavyy.javabasics.exceptions.ExceptionRule.UNREACHABLE_API;

public class UnreachableApiException extends ApplicationException {

    public UnreachableApiException(String apiName) {
        super(UNREACHABLE_API, apiName);
    }

    public UnreachableApiException(Throwable cause, String apiName) {
        super(cause, UNREACHABLE_API, apiName);
    }
}
