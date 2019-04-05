package de.thkoeln.reitano.masterthesis.concert.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class City {

  @JsonProperty(value = "city")
  private String cityName;

  public City(String cityName) {
    this.cityName = cityName;
  }
}
