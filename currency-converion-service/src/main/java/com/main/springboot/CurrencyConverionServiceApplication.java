package com.main.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConverionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverionServiceApplication.class, args);
	}

}
