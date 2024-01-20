package com.hop.drivesharing.hopapplication;

import com.hop.drivesharing.hopapplication.security.JwtService;
import com.sun.security.auth.UserPrincipal;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import java.security.Principal;
import java.util.Map;
import java.util.Objects;

@Component
public class UserHandshakeHandler extends DefaultHandshakeHandler {
    private final Logger LOG = LoggerFactory.getLogger(UserHandshakeHandler.class);

    @Autowired
    private JwtService jwtService;

    public UserHandshakeHandler() {
    }

    @Override
    protected Principal determineUser(@NonNull ServerHttpRequest request, @NonNull WebSocketHandler wsHandler, @NonNull Map<String, Object> attributes) {
        final String email = jwtService.extractUserEmail(Objects.requireNonNull(request.getHeaders().get(HttpHeaders.AUTHORIZATION)).get(0));
        LOG.info("User with email '{}' opened the page", email);

        return new UserPrincipal(email);
    }
}