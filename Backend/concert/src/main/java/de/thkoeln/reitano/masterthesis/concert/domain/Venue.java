package de.thkoeln.reitano.masterthesis.concert.domain;

import java.net.URI;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Embeddable
//@Value
//@AllArgsConstructor
@Entity
@Data
@AllArgsConstructor
public class Venue {

  public Venue(String venueURL){
    this.venueURI = URI.create(venueURL);
    this.venueName = null;
  }

//  @JsonProperty(value = "uri")
  @Id
  private URI venueURI;

  @JsonProperty(value = "name")
  private String venueName;
}
