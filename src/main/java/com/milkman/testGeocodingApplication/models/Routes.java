package com.milkman.testGeocodingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Routes {
    @JsonProperty(value = "legs")
    Legs legs;

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

}
