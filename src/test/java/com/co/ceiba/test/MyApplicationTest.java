package com.co.ceiba.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.co.ceiba.consumer.MyApplication;
import com.co.ceiba.services.MessageService;

@Configuration
@ComponentScan(value = "com.co.ceiba.consumer")
public class MyApplicationTest {

	private AnnotationConfigApplicationContext context = null;

	@Bean
	public MessageService getMessageService() {
		return (msg, rec) -> {
			System.out.println("Mock Service");
			return true;
		};
	}

	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
	}

	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void prueba() {
		MyApplication app = context.getBean(MyApplication.class);
		Assert.assertTrue(app.processMessage("Bienvenu SV", "s24@s24.com"));
	}

}
