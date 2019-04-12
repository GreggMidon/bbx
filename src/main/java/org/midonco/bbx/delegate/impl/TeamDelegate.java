package org.midonco.bbx.delegate.impl;

import java.util.List;
import java.util.Map;

import org.midonco.bbx.delegate.ITeamDelegate;
import org.midonco.bbx.service.impl.TeamService;
import org.springframework.beans.factory.annotation.Autowired;


public class TeamDelegate implements ITeamDelegate {

	@Autowired
	TeamService teamService;
	
	@Override
	public List<Map<String, Object>> getTeamssBySeason(int season) {
		return teamService.getTeamsBySeason(season);
	}

	@Override
	public List<Map<String, Object>> getTeamRosterBySeason(int season, String team_id) {
		return teamService.getTeamRosterBySeason(season, team_id);
	}

}
