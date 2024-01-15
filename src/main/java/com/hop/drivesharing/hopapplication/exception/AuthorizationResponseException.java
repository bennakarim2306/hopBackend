package com.hop.drivesharing.hopapplication.exception;


import com.hop.drivesharing.hopapplication.rest.v1.errorHandling.ErrorCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthorizationResponseException extends Exception {

    private ErrorCode code;

    public AuthorizationResponseException(String message) {
        super(message);
    }

    public AuthorizationResponseException(String message, ErrorCode code) {
        super(message);
        this.code = code;
    }
}
