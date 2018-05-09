package com.co.ceiba.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.co.ceiba.consumer.MyXMLApplication;

public class ClientXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyXMLApplication app = context.getBean(MyXMLApplication.class);
		app.processMessage("Buen dia", "sebas@sebas.com");

		// close the context
		context.close();
	}

}
