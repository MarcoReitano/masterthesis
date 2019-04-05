package de.thkoeln.reitano.masterthesis.venue.domain;

import lombok.Value;

@Value
public class Country {

  private final String country;

  public Country(String country) {
    this.country = country;
  }
}
