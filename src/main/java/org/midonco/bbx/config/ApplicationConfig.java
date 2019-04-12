package org.midonco.bbx.config;

import org.midonco.bbx.delegate.impl.SeasonDelegate;
import org.midonco.bbx.delegate.impl.TeamDelegate;
import org.midonco.bbx.service.impl.SeasonService;
import org.midonco.bbx.service.impl.TeamService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {
	
	@Bean
	public TeamDelegate teamDelegate() {
		return new TeamDelegate();
	}
	
	@Bean
	public TeamService teamService() {
		return new TeamService();
	}
	
	@Bean
	public SeasonDelegate seasonDelegate() {
		return new SeasonDelegate();
	}
	
	@Bean
	public SeasonService seasonService() {
		return new SeasonService();
	}
}
