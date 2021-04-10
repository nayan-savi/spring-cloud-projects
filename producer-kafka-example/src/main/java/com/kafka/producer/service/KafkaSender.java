package com.kafka.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, Object> template;

    private final static String TOPIC_NAME = "NOTIFY_EVENT";

    public void sendNotify(String json) {
        template.send(KafkaSender.TOPIC_NAME, json);
    }

}
