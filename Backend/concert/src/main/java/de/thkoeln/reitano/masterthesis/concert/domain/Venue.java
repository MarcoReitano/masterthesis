package de.thkoeln.reitano.masterthesis.concert.domain;

import java.net.URI;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Embeddable
@Value
//@AllArgsConstructor
//@Entity
//@Data
//@AllArgsConstructor
public class Venue {

  public Venue(String venueURI){
    this.venueURI = URI.create(venueURI);
    this.venueName = null;
  }

  public Venue(URI venueURI, String venueName){
    this.venueURI = venueURI;
    this.venueName = venueName;
  }

//  @JsonProperty(value = "uri")
//  @Id
  private URI venueURI;

  @JsonProperty(value = "name")
  private String venueName;
}
