package com.analyzer.sentiment_sense;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")  // This tells Spring Boot to use the 'application-test.properties' file
class SentimentSenseApplicationTests {
 
	@Test
	void contextLoads() {
	}

}
