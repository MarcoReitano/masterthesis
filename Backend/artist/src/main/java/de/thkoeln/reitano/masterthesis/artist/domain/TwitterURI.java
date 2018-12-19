package de.thkoeln.reitano.masterthesis.artist.domain;

import java.net.URI;

import javax.persistence.Embeddable;

import lombok.Value;

@Embeddable
@Value
public class TwitterURI {

  TwitterURI(String twitterURI)
  {
    this.twitterURI = URI.create(twitterURI);
  }

  URI twitterURI;
}
