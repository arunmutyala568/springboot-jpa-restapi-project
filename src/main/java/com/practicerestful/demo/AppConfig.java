package com.practicerestful.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practicerestful.demo.Service.ManagerService;

@Configuration
public class AppConfig {

	@Bean
	public ManagerService giveManager(){
		return new ManagerService();
	}
}
