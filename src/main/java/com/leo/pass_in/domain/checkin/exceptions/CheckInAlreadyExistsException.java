package com.leo.pass_in.domain.checkin.exceptions;

public class CheckInAlreadyExistsException extends RuntimeException {

    public CheckInAlreadyExistsException(String msg) {
        super(msg);
    }

}
