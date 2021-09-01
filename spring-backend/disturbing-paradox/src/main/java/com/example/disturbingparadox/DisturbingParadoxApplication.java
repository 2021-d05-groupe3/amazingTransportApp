package com.example.disturbingparadox;

import com.example.disturbingparadox.config.CorsConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200")
@Import({CorsConfig.class})
public class DisturbingParadoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisturbingParadoxApplication.class, args);
	}

}
