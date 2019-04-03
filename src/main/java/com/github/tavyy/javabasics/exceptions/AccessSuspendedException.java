package com.github.tavyy.javabasics.exceptions;

import static com.github.tavyy.javabasics.exceptions.ExceptionRule.ACCESS_SUSPENDED;

public class AccessSuspendedException extends ApplicationException {

    public AccessSuspendedException() {
        super(ACCESS_SUSPENDED);
    }

    public AccessSuspendedException(Throwable cause) {
        super(cause, ACCESS_SUSPENDED);
    }
}
