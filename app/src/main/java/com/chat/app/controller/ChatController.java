package com.chat.app.controller;

import org.springframework.stereotype.Controller;

import com.chat.app.model.ChatMessage;

@Controller

public class ChatController {
    public ChatMessage sendMessage(ChatMessage messgage) {
        return messgage;
    }
}
