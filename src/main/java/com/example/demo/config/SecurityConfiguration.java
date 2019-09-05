package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/static/css/**", "/js/**", "/images/**", "/h2-console/**");
	}
	
//	 @Autowired
//	  public void initialize(AuthenticationManagerBuilder builder, DataSource dataSource) throws Exception {
//	    builder.jdbcAuthentication().dataSource(dataSource).withUser("admin")
//	      .password("admin").roles("USER");
//	  }
}
