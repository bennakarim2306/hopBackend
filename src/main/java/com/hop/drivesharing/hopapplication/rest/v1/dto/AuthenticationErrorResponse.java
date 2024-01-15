package com.hop.drivesharing.hopapplication.rest.v1.dto;


import com.hop.drivesharing.hopapplication.rest.v1.errorHandling.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class AuthenticationErrorResponse {

    @NonNull
    String message;
    @NonNull
    ErrorCode errorCode;


}
