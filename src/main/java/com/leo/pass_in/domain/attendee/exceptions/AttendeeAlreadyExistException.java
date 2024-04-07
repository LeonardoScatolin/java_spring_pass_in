package com.leo.pass_in.domain.attendee.exceptions;

public class AttendeeAlreadyExistException extends RuntimeException {
    public AttendeeAlreadyExistException(String msg) {
        super(msg);
    }
}
