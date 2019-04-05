package de.thkoeln.reitano.masterthesis.venue.domain;

import lombok.Value;

@Value
public class City {

  private final String cityName;

  public City(String cityName) {
    this.cityName = cityName;
  }
}
