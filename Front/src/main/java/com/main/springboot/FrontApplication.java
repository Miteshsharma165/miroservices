package com.main.springboot;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontApplication.class, args);
	}
	@Bean
	public CqlSessionBuilderCustomizer sessionBuilderCustomizer()
	{
		File file=new File("D:\\EclipseWorkspace\\front\\src\\main\\resources\\secure-connect-sarkari-result.zip");
    	 return builder -> builder.withCloudSecureConnectBundle(file.toPath());
	}

}
