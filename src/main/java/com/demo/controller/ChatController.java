package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import com.demo.model.Message;

@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/send")
    public void sendMessage(Message msg) {
        System.out.println("Received: " + msg.getContent());
        simpMessagingTemplate.convertAndSend("/topic/messages", msg);
    }
}
