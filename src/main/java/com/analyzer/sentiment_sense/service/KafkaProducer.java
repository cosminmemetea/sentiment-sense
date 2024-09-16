package com.analyzer.sentiment_sense.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC = "feedback-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendFeedbackMessage(String feedback) {
        kafkaTemplate.send(TOPIC, feedback);
        System.out.println("Message sent to Kafka topic: " + feedback);
    }
}

