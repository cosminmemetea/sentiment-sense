package com.analyzer.sentiment_sense.service;

import com.analyzer.sentiment_sense.model.Feedback;
import com.analyzer.sentiment_sense.repository.FeedbackRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    private final FeedbackRepository feedbackRepository;

    public KafkaListenerService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @KafkaListener(topics = "feedback-topic", groupId = "sentiment-group")
    public void listen(String message) {
        System.out.println("Received Message: " + message);

        // Placeholder for sentiment analysis
        String sentiment = "positive"; // Example

        // Save feedback to the database
        Feedback feedback = new Feedback();
        feedback.setMessage(message);
        feedback.setSentiment(sentiment);
        feedbackRepository.save(feedback);
    }
}
