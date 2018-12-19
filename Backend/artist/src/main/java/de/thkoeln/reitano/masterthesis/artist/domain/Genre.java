package de.thkoeln.reitano.masterthesis.artist.domain;

import javax.persistence.Embeddable;

import lombok.Value;

@Embeddable
@Value
public class Genre {

  public Genre(String genre) {
    this.genre = genre;
  }

  String genre;
}
