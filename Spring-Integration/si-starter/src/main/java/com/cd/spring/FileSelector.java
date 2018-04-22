package com.cd.spring;

import java.io.File;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class FileSelector implements MessageSelector{

	@Override
	public boolean accept(Message<?> message) {
		if(message.getPayload() instanceof File && ((File) message.getPayload()).getName().startsWith("Spring")) {
			return true;
		}
		return false;
	}

}
