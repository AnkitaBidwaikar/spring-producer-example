package com.service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {
	
	@Value("${my.app.desti-name}")
	private String destination;
	
	@Autowired
	private JmsTemplate jt;
	
	public void sendMessage(final String message) {
		jt.send(destination,new MessageCreator() {
			public Message createMessage(Session session) 
				throws JMSException
				{
				
			return session.createTextMessage(message);
				}
		});
	}
}
		
			
		
			
		

		
