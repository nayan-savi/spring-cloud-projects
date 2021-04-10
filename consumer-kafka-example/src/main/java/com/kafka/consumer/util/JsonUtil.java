package com.kafka.consumer.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil<T> {

    private final Class<T> type;

    public JsonUtil(Class<T> type) {
        this.type = type;
    }

    public T getObject(String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(message, type);
    }
}
