package de.thkoeln.reitano.masterthesis.artist.domain;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Artist {

  protected Artist(){
    this.id = UUID.randomUUID();
  }

  @Id
  private UUID id;

  @Embedded
  @JsonUnwrapped
  private ArtistAlias alias;

  @Embedded
  @JsonUnwrapped
  private Genre genre;

  @Embedded
  @JsonUnwrapped
  private WebsiteURI websiteURI;

  @Embedded
  @JsonUnwrapped
  private FacebookURI facebookURI;

  @Embedded
  @JsonUnwrapped
  private TwitterURI twitterURI;

  @Embedded
  @JsonUnwrapped
  private MTVURI mtvURI;
}
