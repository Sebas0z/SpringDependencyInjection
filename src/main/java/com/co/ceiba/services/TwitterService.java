package com.co.ceiba.services;

public class TwitterService implements MessageService {

	@Override
	public boolean sendMessage(String message, String rec) {
		System.out.println("Twitter message Sent to "+ rec + " with Message= " + message);
		return false;
	}

}
