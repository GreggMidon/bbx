package org.midonco.bbx.service;

import java.util.List;
import java.util.Map;

public interface ITeamService {

	public abstract List<Map<String, Object>> getTeamsBySeason(int season);
	
	public abstract List<Map<String, Object>> getTeamRosterBySeason(int season, String team_id);
	
}
