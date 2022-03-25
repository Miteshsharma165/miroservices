package com.main.springboot.curencycexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;

@RestController
public class CircuitBreakerController {

	Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

	@GetMapping("/sample-api")
	//@Retry(name = "sample-api" ,fallbackMethod = "hardCodedResponse")
	//@CircuitBreaker(name="default" ,fallbackMethod = "hardCodedResponse")
	//@RateLimiter(name="default")
	@Bulkhead(name="default")
	// rate limiter sets the limit in how much time ,how many calls/request can
	// example in 10s === 1000 request are allow
	public String sampleApi() {
		/*
		 * logger.info("sample-api call  recived"); ResponseEntity<String> forEntity =
		 * new RestTemplate().getForEntity("http://localhost:8080/sample-api",
		 * String.class);
		 */

		return "sample-api";
	}
	
	public String hardCodedResponse(Throwable th) {
		return "hardCodedResponse";
	}

}
