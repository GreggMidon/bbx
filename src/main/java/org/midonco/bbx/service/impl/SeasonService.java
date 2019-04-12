package org.midonco.bbx.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.midonco.bbx.service.ISeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
@ImportResource("classpath:/bbx-sql.xml")
public class SeasonService implements ISeasonService {
	
    @Resource(name="bbxServiceSql")
    Map<String, String> sql;
    
	@Autowired
	@Qualifier("jdbcPg")
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> getSeasonList() {
		return jdbcTemplate.queryForList(sql.get("seasonList"));
	}

}
