package com.analyzer.sentiment_sense.repository;

import com.analyzer.sentiment_sense.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
