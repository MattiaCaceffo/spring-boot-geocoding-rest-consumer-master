package com.milkman.testGeocodingApplication;

import com.milkman.testGeocodingApplication.models.GeoCoding;
import com.milkman.testGeocodingApplication.services.GeoCodingApiController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GeocodingApplication {

	/*private static final Logger log = LoggerFactory.getLogger(GeoCodingApiController.class);

	@Autowired
	private Environment env;*/

	public static void main(String[] args) {
		SpringApplication.run(GeocodingApplication.class, args);
	}
	
	/*@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}*/
	
	/*@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			System.out.println("-----> " + env.getProperty("apiKey"));
			GeoCoding geoCoding = restTemplate.getForObject(
					"https://maps.googleapis.com/maps/api/geocode/json?address=via roma 12 37139 verona&key=AIzaSyDBU8xCVPqWV4vPasIBKfZhT6VV7K26sEU", GeoCoding.class);
			log.info(geoCoding.toString());
		};
	}*/

}
