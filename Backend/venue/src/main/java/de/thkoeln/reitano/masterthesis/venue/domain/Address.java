package de.thkoeln.reitano.masterthesis.venue.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.Value;

@Value
@Embeddable
public class Address {

  @Embedded
  @JsonUnwrapped
  private Street street;

  @Embedded
  @JsonUnwrapped
  private StreetNumber streetNumber;

  @Embedded
  @JsonUnwrapped
  private City city;

  @Embedded
  @JsonUnwrapped
  private Country country;
}
