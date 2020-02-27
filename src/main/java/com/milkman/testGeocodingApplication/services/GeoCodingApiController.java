package com.milkman.testGeocodingApplication.services;

import com.milkman.testGeocodingApplication.models.GeoCoding;
import com.milkman.testGeocodingApplication.models.Directions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class GeoCodingApiController {

	private static final Logger log = LoggerFactory.getLogger(GeoCodingApiController.class);
	private static final String GEOCODING_URI = "https://maps.googleapis.com/maps/api/geocode/json";
	private static final String DIRECTIONS_URI = "https://maps.googleapis.com/maps/api/directions/json";


//	@Autowired
//	private Environment env;

	@Value("${apiKeyGeocoding}")
	private String apiKeyGeocoding;
	@Value("${apiKeyDirections}")
	private String apiKeyDirect;

	@RequestMapping("/getGeoCoding")
	public GeoCoding getGeoCodingForLoc(@RequestParam(value = "address", defaultValue="Via Germania 11, 37136 Verona VR") String address) {
		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(GEOCODING_URI).queryParam("address", address)
				.queryParam("key", apiKeyGeocoding);
			
		log.info("Calling geocoding api with: " + builder.toUriString());
		
		GeoCoding geoCoding = restTemplate.getForObject(builder.toUriString(), GeoCoding.class);
		log.info(geoCoding.toString());

		return geoCoding;
	}

	@RequestMapping("/goTest")
	public GeoCoding getGeocodingTest(@RequestParam(value = "address", defaultValue="Via Germania 11, 37136 Verona VR") String address) {
		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(GEOCODING_URI).queryParam("address", address)
				.queryParam("key", apiKeyGeocoding);

		log.info("Calling geocoding api with: " + builder.toUriString());

		GeoCoding geoCoding = restTemplate.getForObject(builder.toUriString(), GeoCoding.class);
		log.info(geoCoding.toString());

		return geoCoding;
	}

	@RequestMapping("/getDirection")
	public Directions getDirections(@RequestParam(value = "place_id", defaultValue="ChIJl2_k5izggUcRkC-gVtTbbuU") String place_id) {
		RestTemplate restTemplate = new RestTemplate();
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DIRECTIONS_URI).queryParam("origin", "place_id:" + place_id).queryParam("destination", "place_id:" + place_id)
				.queryParam("key", apiKeyDirect);

		log.info("Calling directions api with: " + builder.toUriString());

		Directions directions = restTemplate.getForObject(builder.toUriString(), Directions.class);
		log.info(directions.toString());

		return directions;
	}
}
