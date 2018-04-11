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
		SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext ctx = new SpringApplication(Application.class).run(args);
		
		/*
		 * Publisher-Subscriber Channel
		 * 
		 * To execute below code block, set the following properties in integration.xml
		 * Pub - Sub message channel --- Enabled
		 * Inbound and Outbound Adapters --- Enabled
		 * Pollable / Direct Channel --- Disabled
		 * Queue --- Disabled
		 * 
		 */
		Thread t1 = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int count = 0;
				while (count < 5) {
					System.out.println("\n\nStarting " + (++count) + " iteration!");
					MessageChannel channel = ctx.getBean("messageChannel", MessageChannel.class);
					Message<String> message1 = MessageBuilder
							.withPayload("Message " + count + " comming from Message Builder through channel!").build();
					channel.send(message1);
					try {
						// System.out.println("Thread is going into sleep...");
						sleep(1000);
						// System.out.println("Thread waking up...");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		/****** Uncomment following t1.start() call to test Subscribable Channel realization ******/
		
		// t1.start();
		
		
		/*
		 * Pollable Channel with Queue
		 * 
		 * To execute below code block, set the following properties in integration.xml
		 * Pub - Sub message channel --- Disabled
		 * Inbound and Outbound Adapters --- Disabled
		 * Pollable / Direct Channel --- Enabled
		 * Queue --- Enabled
		 * 
		 */
		Thread t2 = new Thread() {
			@Override
			public void run() {
			
				MessageChannel channel = ctx.getBean("messageChannel", MessageChannel.class);
				Message<String> message1 = MessageBuilder
						.withPayload("\n\nFirst message payload to be published to the channel!").build();
				channel.send(message1);
				System.out.println("First Message Sent...");
				Message<String> message2 = MessageBuilder
						.withPayload("Payload of second message to be published to the channel!").build();
				channel.send(message2);
				System.out.println("Second Message Sent...");
				Message<String> message3 = MessageBuilder.withPayload(
						"This message cannot be published unless the above two messages are published because the queue is full!")
						.build();
				channel.send(message3);
				System.out.println("Third Message Sent...");
				
				while(true) {
					
				}

			}
		};
		
		/****** Uncomment following t2.start() call to test Pollable Channel realization ******/
		
		//t2.start();
		
		/*
		 * Direct Channel
		 * 
		 * To execute below code block, set the following properties in integration.xml
		 * Pub - Sub message channel --- Disabled
		 * Inbound and Outbound Adapters --- Enabled
		 * Pollable / Direct Channel --- Enabled
		 * Queue --- Disabled
		 * 
		 */
		Thread t3 = new Thread() {
			@Override
			public void run() {
				MessageChannel channel = ctx.getBean("messageChannel", MessageChannel.class);
				Message<String> message1 = MessageBuilder
						.withPayload("\n\nSending message to default channel...").setHeader("sender", "Thread 3").build();
				channel.send(message1);
				while(true) {
					
				}
			}
		};
		
		/****** Uncomment following t3.start() call to test Direct Channel realization ******/
		
		t3.start();
		
	}

}
