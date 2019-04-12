package org.midonco.bbx.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.midonco.bbx.delegate.impl.SeasonDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SeasonController {
	
	private static final Logger logger = LoggerFactory.getLogger(SeasonController.class);
	
	@Resource(name="seasonDelegate")
	SeasonDelegate seasonDelegate;

	@RequestMapping("/seasons")
    public List<Map<String, Object>> getSeasonList() {
    	logger.debug("Request: /seasons/");
    	return seasonDelegate.getSeasonList();
    }
	
}
