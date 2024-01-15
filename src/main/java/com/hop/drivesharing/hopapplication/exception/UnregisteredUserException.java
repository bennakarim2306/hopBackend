package com.hop.drivesharing.hopapplication.exception;

import com.hop.drivesharing.hopapplication.rest.v1.errorHandling.ErrorCode;

public class UnregisteredUserException extends AuthorizationResponseException {

    public UnregisteredUserException(String message, ErrorCode code) {
        super(message, code);
    }
}
