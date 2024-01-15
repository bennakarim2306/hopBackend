package com.hop.drivesharing.hopapplication.exception;

import com.hop.drivesharing.hopapplication.rest.v1.errorHandling.ErrorCode;

public class UserAlreadyExistingException extends AuthorizationResponseException {

    public UserAlreadyExistingException(String message, ErrorCode code) {
        super(message, code);
    }
}
