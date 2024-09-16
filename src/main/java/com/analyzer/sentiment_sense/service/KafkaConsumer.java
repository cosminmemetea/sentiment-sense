package com.analyzer.sentiment_sense.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "feedback-topic", groupId = "sentiment-group")
    public void consumeFeedbackMessage(String feedback) {
        System.out.println("Message received from Kafka topic: " + feedback);

        // Here you can call the sentiment analysis service to process feedback
        analyzeSentiment(feedback);
    }

    private void analyzeSentiment(String feedback) {
        // Call the sentiment analysis component here
        System.out.println("Processing feedback for sentiment analysis: " + feedback);
    }
}
