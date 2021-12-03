package com.config;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class AppConfig {

	public ConnectionFactory cf() {
		ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();
		cf.setBrokerURL("tcp://localhost:61616");
		cf.setUserName("admin");
		cf.setPassword("admin");
		return cf;

	}

	@Bean
	public JmsTemplate jt() {
		return new JmsTemplate(cf());
	}
}
