package com.milkman.testGeocodingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoCodingResult {
    @JsonProperty(value = "formatted_address")
    String formattedAddress;

    @JsonProperty(value = "geometry")
    Geometry geometry;

    @JsonProperty("place_id")
    String placeId;

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @Override
    public String toString() {
        return "GeoCodingResult [formattedAddress=" + formattedAddress + ", placeId=" + placeId + "]";
    }

}

