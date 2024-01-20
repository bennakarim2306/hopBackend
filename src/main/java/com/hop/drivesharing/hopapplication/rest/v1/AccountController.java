package com.hop.drivesharing.hopapplication.rest.v1;

import com.hop.drivesharing.hopapplication.rest.v1.dto.AccountInformationResponse;
import com.hop.drivesharing.hopapplication.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/addFriend/{email}")
    public void addFriendByEmail(@RequestHeader("Authorization") String authHeader, @PathVariable String email) throws Exception {
        accountService.addFriendToList(authHeader, email);
    }

    @GetMapping("/friendsList")
    public AccountInformationResponse addFriendByEmail(@RequestHeader("Authorization") String authHeader) {
        return accountService.getFriendsList(authHeader);
    }
}
