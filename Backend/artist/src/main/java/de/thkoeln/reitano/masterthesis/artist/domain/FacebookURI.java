package de.thkoeln.reitano.masterthesis.artist.domain;

import java.net.URI;

import javax.persistence.Embeddable;

import lombok.Value;

@Embeddable
@Value
public class FacebookURI {

  private static URI facebookHost = URI.create("http://www.facebook.com");

  public FacebookURI(String facebookURI) {
    this.facebookURI = URI.create(facebookURI);

    if(!this.facebookURI.getHost().equalsIgnoreCase(facebookHost.getHost()))
    {
      throw new IllegalArgumentException("FacebookURI has to start with" + facebookHost.getHost());
    }
  }

  URI facebookURI;
}
