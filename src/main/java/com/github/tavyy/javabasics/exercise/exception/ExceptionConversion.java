package com.github.tavyy.javabasics.exercise.exception;

import com.github.tavyy.javabasics.exceptions.NotAllowedException;
import com.github.tavyy.javabasics.exceptions.ObjectNotFoundException;
import com.github.tavyy.javabasics.exceptions.TechnicalErrorException;
import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.IOException;

@Slf4j
public class ExceptionConversion {

    public static void main(String[] args) {
        execute(5);
    }

    public static void execute(int value) {
        try {
            throwException(value);
        } catch (Exception e) {
            throw new TechnicalErrorException(e, "An unknown error occurred");
        }
    }

    private static void throwException(int value) throws Exception {
        switch (value) {
            case 1:
                throw new IOException();
            case 2:
                throw new FileNotFoundException();
            case 3:
                throw new Exception();
        }
        throwRuntimeException(value);
    }

    private static void throwRuntimeException(int value) {
        switch (value) {
            case 4:
                throw new NotAllowedException("Not allowed");
            case 5:
                throw new ObjectNotFoundException("User not found");
            case 6:
                throw new RuntimeException();
        }
    }
}
