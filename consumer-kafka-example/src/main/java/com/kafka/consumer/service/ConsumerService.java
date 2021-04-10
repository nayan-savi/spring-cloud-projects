package com.kafka.consumer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kafka.consumer.model.Notification;
import com.kafka.consumer.util.JsonUtil;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private static final String NOTIFY_EVENT = "NOTIFY_EVENT";
    public static final String GROUP_ID = "group-id";

    @KafkaListener(topics = NOTIFY_EVENT, groupId = GROUP_ID)
    public void consume(String message) throws JsonProcessingException {
        JsonUtil<Notification> jsonUtil = new JsonUtil<>(Notification.class);
        Notification notification = jsonUtil.getObject(message);
        System.out.println("Message received : " + notification);
    }
}
