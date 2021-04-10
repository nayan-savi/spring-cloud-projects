package com.kafka.producer.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class JsonUtil<T> {

    public JsonUtil() {
    }

    public String getJsonValue(T object) throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return objectWriter.writeValueAsString(object);
    }
}
