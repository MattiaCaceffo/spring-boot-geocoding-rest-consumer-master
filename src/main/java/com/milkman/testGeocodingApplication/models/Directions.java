package com.milkman.testGeocodingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Directions {
	String status;
	
	@JsonProperty(value="routes")
	Routes[] routes;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Routes[] getRoutes() {
		return routes;
	}

	public void setRoutes(Routes[] routes) {
		this.routes = routes;
	}

	@Override
	public String toString() {
		return "Directions [status=" + status + ", directionsResults=" + Arrays.toString(routes) + "]";
	}
}
