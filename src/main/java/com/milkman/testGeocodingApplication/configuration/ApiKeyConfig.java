package com.milkman.testGeocodingApplication.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:apikey.properties")
public class ApiKeyConfig {
	
	@Value("${apiKeyGeocoding}")
	private String apiKeyGeocoding;
	@Value("${apiKeyDirections}")
	private String apiKeyDirect;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertyConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}	
}
