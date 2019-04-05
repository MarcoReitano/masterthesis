package de.thkoeln.reitano.masterthesis.concert.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.net.URI;

@RepositoryRestResource(exported = false)
public interface VenueRepository extends CrudRepository<Venue, URI> {
}
