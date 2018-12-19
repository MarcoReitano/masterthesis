package de.thkoeln.reitano.masterthesis.artist.domain;

import java.net.URI;

import javax.persistence.Embeddable;

import com.sun.jndi.toolkit.url.Uri;

import lombok.Value;

@Embeddable
@Value
public class FacebookURI {

  private static URI facebookHostURI = URI.create("http://www.facebook.com");

  FacebookURI(String facebookURI)
  {
    this.facebookURI = URI.create(facebookURI);

    if(!this.facebookURI.getHost().equalsIgnoreCase(facebookHostURI.getHost()))
    {
      throw new IllegalArgumentException("FacebookURI has to start with" + facebookHostURI.getHost());
    }
  }

  URI facebookURI;
}
