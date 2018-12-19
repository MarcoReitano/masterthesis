package de.thkoeln.reitano.masterthesis.artist.domain;

import javax.persistence.Embeddable;

import lombok.Value;

@Embeddable
@Value
public class Name {

  public Name (String name) {
    this.name = name;
  }

  String name;
}
