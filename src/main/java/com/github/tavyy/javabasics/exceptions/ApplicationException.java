package com.github.tavyy.javabasics.exceptions;

public abstract class ApplicationException extends RuntimeException {

    private final ExceptionRule rule;
    private final String[] messageArgs;

    public ApplicationException(ExceptionRule rule, String... messageArgs) {
        this(null, rule, messageArgs);
    }

    public ApplicationException(Throwable cause, ExceptionRule rule, String... messageArgs) {
        super(cause);
        this.rule = rule;
        this.messageArgs = messageArgs;
    }

    public ExceptionRule getRule() {
        return rule;
    }

    @Override
    public String getMessage() {
        return rule.getDescription(messageArgs);
    }

}
