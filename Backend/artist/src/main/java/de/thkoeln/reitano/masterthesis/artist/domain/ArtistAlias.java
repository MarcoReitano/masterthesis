package de.thkoeln.reitano.masterthesis.artist.domain;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Embeddable
@Value
public class ArtistAlias {

  public ArtistAlias(String alias) {
    this.alias = alias;
  }

  String alias;
}
