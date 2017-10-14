package com.springboot.DemoApplication.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	public String retrieveWelcomeMessage() {
		return "welcome bhushan in SpringBoot learning";
	}
}
