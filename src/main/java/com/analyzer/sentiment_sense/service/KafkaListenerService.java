package com.analyzer.sentiment_sense.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    @KafkaListener(topics = "feedback-topic", groupId = "sentiment-group")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
