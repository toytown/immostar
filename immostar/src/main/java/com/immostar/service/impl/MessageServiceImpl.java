package com.immostar.service.impl;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immostar.domain.Message;
import com.immostar.repository.MessageRepository;
import com.immostar.service.interfaces.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService {


    @Autowired
    private MessageRepository messageRepository;
    
    @Override
    public void sendMessage(Message message) {
        messageRepository.save(message);
    }

    @Override
    public void deleteMessage(ObjectId messageId) {
        messageRepository.delete(messageId);
    }

}
