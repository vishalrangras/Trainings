package com.cd.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication
@ImportResource("/int-config/integration.xml")
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		// Uncomment following snippet to test Pollable Channel
		
		/*MessageChannel channel = ctx.getBean("messageChannel", MessageChannel.class);
		Message<String> message1 = MessageBuilder
						.withPayload("\n\nFirst message payload to be published to the Pollable channel!").build();
		channel.send(message1);
		System.out.println("First Message Sent...");
		Message<String> message2 = MessageBuilder
						.withPayload("Payload of second message to be published to the Pollable channel!").build();
		channel.send(message2);
		System.out.println("Second Message Sent...");
		Message<String> message3 = MessageBuilder.withPayload(
						"This message cannot be published unless the above two messages are published because the queue is full!")
						.build();
		channel.send(message3);
		System.out.println("Third Message Sent...");*/
		
	}
	
	
}
