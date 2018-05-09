package com.co.ceiba.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.co.ceiba.configuration.DIConfiguration;
import com.co.ceiba.consumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		app.processMessage("Bonjour SV", "sv@sv.com");

		// close the context
		context.close();
	}
}
