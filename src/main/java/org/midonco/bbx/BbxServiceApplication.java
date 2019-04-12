package org.midonco.bbx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class BbxServiceApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(BbxServiceApplication.class);

	public static void main(String[] args) {
		
		logger.debug("[main]: begin...");
		SpringApplication.run(BbxServiceApplication.class, args);
		logger.debug("[main]: end.");
	}

}

