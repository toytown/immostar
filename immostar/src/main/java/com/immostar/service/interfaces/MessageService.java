package com.immostar.service.interfaces;

import org.bson.types.ObjectId;

import com.immostar.domain.Message;

public interface MessageService {

    public void sendMessage(Message message);
    
    public void deleteMessage(ObjectId messageId);
}
