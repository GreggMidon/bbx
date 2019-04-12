package org.midonco.bbx.controller;

//import java.util.Map;

//import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/version")
	public String getVersion() {
		logger.debug("Request: /test/version");
		return "0.0.1\n";
	}
}
