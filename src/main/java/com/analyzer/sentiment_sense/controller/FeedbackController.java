package com.analyzer.sentiment_sense.controller;

import com.analyzer.sentiment_sense.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/submit")
    public String submitFeedback(@RequestBody String feedback) {
        kafkaProducer.sendFeedbackMessage(feedback);
        return "Feedback submitted successfully!";
    }
}
