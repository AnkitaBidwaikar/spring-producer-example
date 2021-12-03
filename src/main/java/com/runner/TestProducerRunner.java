package com.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.service.ProducerService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestProducerRunner implements CommandLineRunner {

	@Autowired
	private ProducerService service;

	public void run(String... args) throws Exception {

		service.sendMessage(" HELLO SAMPLE " + new Date());
		log.info("MESSAGE IS SENT");

	}

}
