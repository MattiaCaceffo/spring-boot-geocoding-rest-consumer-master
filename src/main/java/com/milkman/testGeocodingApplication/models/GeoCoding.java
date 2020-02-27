package com.milkman.testGeocodingApplication.models;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GeoCoding {
	String status;
	
	@JsonProperty(value="results")
	DirectionsResult[] geoCodingResults;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DirectionsResult[] getGeoCodingResults() {
		return geoCodingResults;
	}

	public void setGeoCodingResults(DirectionsResult[] geoCodingResults) {
		this.geoCodingResults = geoCodingResults;
	}

	@Override
	public String toString() {
		return "GeoCoding [status=" + status + ", geoCodingResults=" + Arrays.toString(geoCodingResults) + "]";
	}
}
