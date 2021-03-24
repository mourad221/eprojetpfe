package com.groupe.eprojet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class EprojetApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(EprojetApplication.class, args);
	}


	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedHeaders("Access-Control-Allow-Origin", "*")
				.allowedHeaders("Access-Control-Allow-Headers", "Content-Type,x-requested-with").maxAge(20000)
				.allowCredentials(false).allowedMethods("GET", "POST", "DELETE", "PUT");
	}

}
