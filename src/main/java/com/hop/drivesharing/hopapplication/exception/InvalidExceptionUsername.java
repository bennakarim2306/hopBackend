package com.hop.drivesharing.hopapplication.exception;

import com.hop.drivesharing.hopapplication.rest.v1.errorHandling.ErrorCode;

public class InvalidExceptionUsername extends AuthorizationResponseException {
    public InvalidExceptionUsername(String message, ErrorCode code) {
        super(message, code);
    }
}
