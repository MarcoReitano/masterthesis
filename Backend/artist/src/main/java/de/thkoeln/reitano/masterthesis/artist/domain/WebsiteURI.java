package de.thkoeln.reitano.masterthesis.artist.domain;

import java.net.URI;

import javax.persistence.Embeddable;

import lombok.Value;

@Embeddable
@Value
public class WebsiteURI {

  public WebsiteURI(String websiteURI) {
    this.websiteURI = URI.create(websiteURI);
  }

  URI websiteURI;
}
