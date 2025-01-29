package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}

	@Bean(name = "ldt")
	public LocalDateTime dateTime() {
		System.out.println("AppConfig.dateTime()");
		return LocalDateTime.now();
	}
}
