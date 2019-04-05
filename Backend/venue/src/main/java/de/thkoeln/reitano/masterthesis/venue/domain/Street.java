package de.thkoeln.reitano.masterthesis.venue.domain;

import lombok.Value;

@Value
public class Street {

  private final String street;

  public Street(String street) {
    this.street = street;
  }
}
