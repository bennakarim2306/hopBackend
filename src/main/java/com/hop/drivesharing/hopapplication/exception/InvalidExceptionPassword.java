package com.hop.drivesharing.hopapplication.exception;

import com.hop.drivesharing.hopapplication.rest.v1.errorHandling.ErrorCode;

public class InvalidExceptionPassword extends AuthorizationResponseException {
    public InvalidExceptionPassword(String message, ErrorCode code) {
        super(message, code);
    }
}
