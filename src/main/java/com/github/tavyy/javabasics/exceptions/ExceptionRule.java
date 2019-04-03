package com.github.tavyy.javabasics.exceptions;

public enum ExceptionRule {

    NOT_ALLOWED("Operation '%s' not allowed.", ExceptionFamily.FORBIDDEN),

    INSUFFICIENT_PRIVILEGES("You do not have appropriate privileges to execute this operation.", ExceptionFamily.UNAUTHORIZED),
    WRONG_CREDENTIALS("The authentication credentials are wrong.", ExceptionFamily.UNAUTHORIZED),
    ACCESS_SUSPENDED("Your access has been suspended", ExceptionFamily.UNAUTHORIZED),

    MISSING_INPUT_DATA("The field '%s' is missing.", ExceptionFamily.BAD_REQUEST),
    INVALID_INPUT_DATA("The field '%s' is invalid.", ExceptionFamily.BAD_REQUEST),

    OBJECT_NOT_FOUND("The '%s' was not found.", ExceptionFamily.NOT_FOUND),

    MALFORMED_RESPONSE("Malformed response from '%s'.", ExceptionFamily.EXTERNAL_CONNECTION),
    UNREACHABLE_API("The '%s' API is unavailable.", ExceptionFamily.EXTERNAL_CONNECTION),

    DATA_INCONSISTENCY("Data inconsistency problem.", ExceptionFamily.TECHNICAL),
    TECHNICAL_ERROR("Technical error with '%s'.", ExceptionFamily.TECHNICAL);

    private String description;
    private ExceptionFamily family;

    ExceptionRule(String description, ExceptionFamily family) {
        this.description = description;
        this.family = family;
    }

    String getDescription(String... args) {
        return (args == null || args.length == 0) ? description : String.format(description, args);
    }

    public ExceptionFamily getFamily() {
        return family;
    }

}
