package com.smtech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ChangesConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChangesConsumer.class);

    @KafkaListener(topics = "myFirstTopic",groupId = "myGroup")
    public void  Consume(String eventMessage){
        LOGGER.info(String.format("Event message Recived -> %s",eventMessage));


    }

}
