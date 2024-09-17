package com.analyzer.sentiment_sense.controller;


import org.springframework.web.bind.annotation.*;

import com.analyzer.sentiment_sense.service.KafkaProducerService;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/publish")
    public String publishMessage(@RequestParam("message") String message) {
        kafkaProducerService.sendMessage(message);
        return "Message sent to Kafka topic: " + message;
    }
}
