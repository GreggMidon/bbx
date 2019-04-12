package org.midonco.bbx.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import org.postgresql.ds.PGSimpleDataSource;


@Configuration
public class PgDataSource {

	@Autowired
	Environment env;
	
	@Primary
	@Bean(name = "dsPg")
	public DataSource pgDataSource() throws SQLException {
		
		PGSimpleDataSource dataSource = new PGSimpleDataSource();
		dataSource.setDatabaseName("dev");
		dataSource.setUser(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		dataSource.setURL(env.getProperty("spring.datasource.url"));
	
		return dataSource;
	}

	@Bean(name = "jdbcPg")
	public JdbcTemplate jdbcTemplate(DataSource dsPg) {
		return new JdbcTemplate(dsPg);
	}
}
