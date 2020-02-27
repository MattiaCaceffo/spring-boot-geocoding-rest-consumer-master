package com.milkman.testGeocodingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DirectionsResult {
	@JsonProperty(value = "routes")
	Routes routes;

	public Routes getRoutes() {
		return routes;
	}

	public void setRoutes(Routes routes) {
		this.routes = routes;
	}

	@Override
	public String toString() {
		return "DirectionsResult [routes=" + routes + "]";
	}
}
