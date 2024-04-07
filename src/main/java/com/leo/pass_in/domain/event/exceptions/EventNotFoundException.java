package com.leo.pass_in.domain.event.exceptions;

public class EventNotFoundException extends RuntimeException {

    public EventNotFoundException(String msg) {
        super(msg);
    }

}
