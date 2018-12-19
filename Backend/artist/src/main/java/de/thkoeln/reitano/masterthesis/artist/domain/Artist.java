package de.thkoeln.reitano.masterthesis.artist.domain;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {

  protected Artist(){
    this.id = UUID.randomUUID();
  }

  public Artist(String alias, String genre, String facebookURI, String twitterURI){
    this.id = UUID.randomUUID();

    this.alias = new ArtistAlias(alias);
    this.genre = new Genre(genre);
    this.facebookURI = new FacebookURI(facebookURI);
    this.twitterURI = new TwitterURI(twitterURI);
  }

  @Id
  private UUID id;

  @Embedded
//  @JsonUnwrapped
  private ArtistAlias alias;

  @Embedded
//  @JsonUnwrapped
  private Genre genre;

  @Embedded
  private FacebookURI facebookURI;

  @Embedded
  private TwitterURI twitterURI;
}
