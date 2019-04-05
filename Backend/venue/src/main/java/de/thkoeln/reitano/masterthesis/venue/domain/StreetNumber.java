package de.thkoeln.reitano.masterthesis.venue.domain;

import lombok.Value;

@Value
public class StreetNumber {

  private final String streetNumber;

  public StreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }
}
