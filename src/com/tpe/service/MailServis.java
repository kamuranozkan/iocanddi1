package com.tpe.service;

import com.tpe.domain.Message;

public class MailServis implements MessageService {


    @Override
    public void sendMessage(Message message) {
        System.out.println("ben mail servisiyim size mesaj gönderiyorum "+message.getMessage());
    }
}

