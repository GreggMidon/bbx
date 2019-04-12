package org.midonco.bbx;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServletInitializer extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(ServletInitializer.class);
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		
		logger.debug("[configure]: begin - no end");
		
		return application.sources(BbxServiceApplication.class);
	}

}

