package com.hop.drivesharing.hopapplication.rest.v1;

import com.hop.drivesharing.hopapplication.rest.v1.dto.AccountInformationResponse;
import com.hop.drivesharing.hopapplication.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/account")
public class AccountController {

    private final AccountService accountService;


    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/addFriend/{email}")
    public void addContactByEmail(@RequestHeader("Authorization") String authHeader, @PathVariable String email) throws Exception {
        // TODO send a friend add request to User
        AccountInformationResponse accountInformationResponse = accountService.generateContactRequest(authHeader, email);
        accountInformationResponse.setEmail(email);
    }

    @GetMapping("/friendsList")
    @ResponseStatus(HttpStatus.OK)
    public AccountInformationResponse getFriendsList(@RequestHeader("Authorization") String authHeader) {
        return accountService.getFriendsList(authHeader);
    }
}
