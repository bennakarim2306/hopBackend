package com.hop.drivesharing.hopapplication.rest.v1.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountInformationResponse {

    @JsonProperty("friends")
    private List<UserLight> friends;
    private String email;
    private String firstName;
    private String lastName;

}
