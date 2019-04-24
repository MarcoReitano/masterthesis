package de.thkoeln.reitano.masterthesis.concert.domain;

import org.springframework.data.rest.core.annotation.RestResource;

import java.net.URI;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

//@Embeddable
//@Value
//@AllArgsConstructor
//@Entity
//@Data
//@AllArgsConstructor
@Embeddable
@Value
public class Artist {

  public Artist(URI artistURI, String alias){
    this.artistURI = artistURI;
    this.alias = alias;
  }

//  @JsonProperty(value="uri")
//  @Id
//  @RestResource(exported = true)
  private URI artistURI;

  @JsonProperty(value="alias")
  private String alias;

}
