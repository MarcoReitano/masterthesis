package de.thkoeln.reitano.masterthesis.artist.domain;

import java.net.URI;

import javax.persistence.Embeddable;

import lombok.Value;

@Embeddable
@Value
public class MTVURI {

  private static URI mtvHost = URI.create("http://www.mtv.com");

  public MTVURI(String mtvURI){
    this.mtvURI = URI.create(mtvURI);
    if(!this.mtvURI.getHost().equalsIgnoreCase(mtvHost.getHost()))
    {
      throw new IllegalArgumentException("MTVURI has to start with" + mtvHost.getHost());
    }
  }

  URI mtvURI;
}
