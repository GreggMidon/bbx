package org.midonco.bbx.delegate.impl;

import java.util.List;
import java.util.Map;

import org.midonco.bbx.delegate.ISeasonDelegate;
import org.midonco.bbx.service.impl.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;


public class SeasonDelegate implements ISeasonDelegate {

	@Autowired
	SeasonService seasonService;
	
	@Override
	public List<Map<String, Object>> getSeasonList() {
		return seasonService.getSeasonList();
	}

}
