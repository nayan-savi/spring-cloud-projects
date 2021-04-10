package com.kafka.producer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kafka.producer.enums.Media;
import com.kafka.producer.model.Notification;
import com.kafka.producer.service.KafkaSender;
import com.kafka.producer.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class SenderController {

    @Autowired
    private KafkaSender kafkaSender;

    @GetMapping(value = "/send")
    public String producer() throws JsonProcessingException {
        Notification notification = new Notification();
        notification.setTitle("Kafka tutorial");
        notification.setType(Media.VIDEO);
        notification.setComment("Part 1 video has been uploaded");

        String jsonValue = new JsonUtil().getJsonValue(notification);
        kafkaSender.sendNotify(jsonValue);
        return "Sent successfully";

    }


}
