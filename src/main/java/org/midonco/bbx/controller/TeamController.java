package org.midonco.bbx.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.midonco.bbx.delegate.impl.TeamDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/teams")
public class TeamController {
	
	private static final Logger logger = LoggerFactory.getLogger(TeamController.class);
	
	@Resource(name="teamDelegate")
	TeamDelegate teamDelegate;
	
    @RequestMapping("/{season}")
    public List<Map<String, Object>> getTeamsBySeason(@PathVariable("season") int season) {
    	logger.debug("Request: /teams/" + String.valueOf(season));
    	return teamDelegate.getTeamssBySeason(season);
    }
	
    @RequestMapping("/{season}/roster/{team_id}")
    public List<Map<String, Object>> getTeamsBySeason(@PathVariable("season") int season, @PathVariable("team_id") String team_id) {
    	logger.debug("Request: /teams/" + String.valueOf(season) + "/roster/" + team_id);
    	return teamDelegate.getTeamRosterBySeason(season, team_id);
    }

}
