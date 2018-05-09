package com.co.ceiba.services;

public class EmailService implements MessageService {
	
	@Override
	public boolean sendMessage(String message, String rec) {
		System.out.println("Email Sent to " + rec + " with Message= " + message);
		return true;
	}

}
