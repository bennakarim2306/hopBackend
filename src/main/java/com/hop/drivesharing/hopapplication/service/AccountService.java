package com.hop.drivesharing.hopapplication.service;

import com.hop.drivesharing.hopapplication.exception.AddFriendToListException;
import com.hop.drivesharing.hopapplication.security.JwtService;
import com.hop.drivesharing.hopapplication.user.User;
import com.hop.drivesharing.hopapplication.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class AccountService {

    private final UserRepository userRepository;
    private final JwtService jwtService;

    public AccountService(UserRepository userRepository, JwtService jwtService) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
    }


    public void addFriendToList(String authHeader, String friendsEmail) throws Exception {
        String email = jwtService.extractUserEmail(authHeader.substring(7));
        try{
            Optional<User> friend = userRepository.findByEmail(friendsEmail);
            String friendsId;
            if(friend.isEmpty()) {
                throw new AddFriendToListException("Friend not found");
            } else {
                friendsId = friend.get().getId();
            }

            Optional<User> user = userRepository.findByEmail(email);
            user.ifPresent(usr ->  {
                String newFriendList = usr.getFriendsList().isEmpty() ? friendsId : usr.getFriendsList() + "|" + friendsId;
                usr.setFriendsList(newFriendList);
                userRepository.save(user.get());
            });
        } catch (Exception e) {
            log.error("Some error occurred during addFriendToList {}", e.getMessage());
            throw e;
        }
    }

    public List<String> getFriendsList(String authHeader) {
        String email = jwtService.extractUserEmail(authHeader.substring(7));
        try {
            Optional<User> user = userRepository.findByEmail(email);
            List<String> friendsIds = user.map(User::getFriendsIdsList).orElse(null);
            if(CollectionUtils.isEmpty(friendsIds)) {
                return null;
            }
            return friendsIds.stream().map(id -> {
                try {
                    return userRepository.findById(id).orElseThrow(Exception::new).getEmail();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }).toList();
        } catch (Exception e) {
            log.error("Some error occurred during getFriendsList {}", e.getMessage());
            throw e;
        }

    }
}
