package com.artur.students.rest.exception_handler;

public class NoSuchStudentException extends RuntimeException {
    public NoSuchStudentException(String message) {
        super(message);
    }
}
