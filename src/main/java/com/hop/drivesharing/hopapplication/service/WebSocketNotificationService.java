package com.hop.drivesharing.hopapplication.service;


import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class WebSocketNotificationService {

    private final SimpMessagingTemplate simpMessagingTemplate;

    public WebSocketNotificationService(SimpMessagingTemplate messagingTemplate) {
        this.simpMessagingTemplate = messagingTemplate;
    }

    public void sendGlobalNotification() {

    }
}
