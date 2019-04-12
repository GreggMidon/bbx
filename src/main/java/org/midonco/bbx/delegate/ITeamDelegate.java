package org.midonco.bbx.delegate;

import java.util.List;
import java.util.Map;

public interface ITeamDelegate {

	public abstract List<Map<String, Object>> getTeamssBySeason(int season);
	
	public abstract List<Map<String, Object>> getTeamRosterBySeason(int season, String team_id);
}
