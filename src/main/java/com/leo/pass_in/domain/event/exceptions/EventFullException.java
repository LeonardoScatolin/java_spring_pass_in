package com.leo.pass_in.domain.event.exceptions;

public class EventFullException extends RuntimeException {

    public EventFullException(String msg) {
        super(msg);
    }

}
