package com.milkman.testGeocodingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Directions {
	String status;
	
	@JsonProperty(value="routes")
	DirectionsResult[] directionsResults;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DirectionsResult[] getDirectionsResults() {
		return directionsResults;
	}

	public void setDirectionsResults(DirectionsResult[] directionsResults) {
		this.directionsResults = directionsResults;
	}

	@Override
	public String toString() {
		return "Directions [status=" + status + ", directionsResults=" + Arrays.toString(directionsResults) + "]";
	}
}
