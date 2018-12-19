package de.thkoeln.reitano.masterthesis.artist.domain;

import javax.persistence.Embeddable;

import lombok.Value;

@Embeddable
@Value
public class ArtistAlias {

  public ArtistAlias(String alias) {
    this.alias = alias;
  }

  String alias;
}
