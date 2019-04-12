package org.midonco.bbx.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.midonco.bbx.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@ImportResource("classpath:/bbx-sql.xml")
public class TeamService implements ITeamService {

    @Resource(name="bbxServiceSql")
    Map<String, String> sql;	

	@Autowired
	@Qualifier("jdbcPg")
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> getTeamsBySeason(int season) {
		return jdbcTemplate.queryForList(sql.get("teamsBySeason"), season);
	}

	@Override
	public List<Map<String, Object>> getTeamRosterBySeason(int season, String team_id) {
		return jdbcTemplate.queryForList(sql.get("teamRosterBySeason"), season, team_id);
	}

}
