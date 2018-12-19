package de.thkoeln.reitano.masterthesis.artist;

import de.thkoeln.reitano.masterthesis.artist.domain.ArtistAlias;
import de.thkoeln.reitano.masterthesis.artist.domain.Genre;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class ArtistsCsvMixin {

  ArtistsCsvMixin(
      @JsonProperty("name") String alias,
      @JsonProperty("genre") String genre,
      @JsonProperty("facebook") String facebookURI,
      @JsonProperty("twitter") String twitterURI){}


}
