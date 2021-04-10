package com.kafka.consumer.deserialize;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class KafkaJsonDeserializer<T> implements Deserializer<T> {

    private Class<T> type;

    public KafkaJsonDeserializer(Class<T> type) {
        this.type = type;
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public T deserialize(String str, byte[] bytes) {

        ObjectMapper objectMapper = new ObjectMapper();
        T obj = null;
        try {
            obj = objectMapper.readValue(bytes, type);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void close() {

    }
}
