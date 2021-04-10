package com.kafka.producer.model;

import com.kafka.producer.enums.Media;
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
