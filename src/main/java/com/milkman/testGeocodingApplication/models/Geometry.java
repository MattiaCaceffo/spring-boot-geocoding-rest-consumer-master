package com.milkman.testGeocodingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {
    @JsonProperty(value = "location")
    Location location;
    @JsonProperty(value = "location_type")
    String location_type;
}
