package com.ram.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.ram.model.Orders;

@Component
public class MessageReceiver
{
	private static final String MESSAGE_QUEUE = "ORDER_QUEUE";
	
	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(Orders product)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received " + product);
	}
	@JmsListener(destination = "queue2")
	public void receiveMessageFromQueue2(Orders product)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received " + product);
	}
}
