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
@Entity
@Data
@AllArgsConstructor
public class Artist {

  public Artist(String artistURL){
    this.artistURI = URI.create(artistURL);
    this.alias = null;
  }

//  @JsonProperty(value="uri")
  @Id
  @RestResource(exported = true)
  private URI artistURI;

  @JsonProperty(value="alias")
  private String alias;

}
