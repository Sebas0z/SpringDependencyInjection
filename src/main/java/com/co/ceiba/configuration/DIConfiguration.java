package com.co.ceiba.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.co.ceiba.services.EmailService;
import com.co.ceiba.services.MessageService;

@Configuration
@ComponentScan(value = { "com.co.ceiba.consumer" })
public class DIConfiguration {

	@Bean
	public MessageService getMessageService() {
		return new EmailService();
	}

}
