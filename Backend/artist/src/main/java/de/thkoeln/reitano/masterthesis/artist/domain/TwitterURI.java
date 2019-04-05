package de.thkoeln.reitano.masterthesis.artist.domain;

import java.net.URI;

import javax.persistence.Embeddable;

import lombok.Value;

@Embeddable
@Value
public class TwitterURI {

  private static URI twitterHost = URI.create("http://www.twitter.com");

  public TwitterURI(String twitterURI)
  {
    this.twitterURI = URI.create(twitterURI);

    if(!this.twitterURI.getHost().equalsIgnoreCase(twitterHost.getHost()))
    {
      throw new IllegalArgumentException("TwitterURI has to start with" + twitterHost.getHost());
    }
  }

  URI twitterURI;
}
