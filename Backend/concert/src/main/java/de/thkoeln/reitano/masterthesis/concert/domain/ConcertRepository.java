package de.thkoeln.reitano.masterthesis.concert.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.net.URI;
import java.util.UUID;

public interface ConcertRepository extends PagingAndSortingRepository<Concert, UUID> {

  @RestResource(rel = "findByArtist", path = "findByArtist")
  Iterable<Concert> findAllByArtistArtistURI(@Param("artist") URI artist);

  @RestResource(rel="findByVenue", path = "findByVenue")
  Iterable<Concert> findAllByVenueVenueURI(@Param("venue") URI venue);
}
