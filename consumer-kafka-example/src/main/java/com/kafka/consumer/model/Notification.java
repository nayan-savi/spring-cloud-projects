package com.kafka.consumer.model;


import com.kafka.consumer.enums.Media;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Notification {

    private String title;
    private Media type;
    private String comment;

}
