package com.artur.common.message.converter;

import com.artur.common.message.Message;
import com.google.gson.Gson;

public class MessageConverter {

    private final Gson gson;

    public MessageConverter() {
        this.gson = new Gson();
    }

    public <T extends Message> T extractMessage(String json, Class<T> clazz){
        return gson.fromJson(json, clazz);
    }

    public String convertToJson(Message message){
        return gson.toJson(message);
    }
}
