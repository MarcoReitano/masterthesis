package de.thkoeln.reitano.masterthesis.venue.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path="venues")
public interface VenueRepository extends PagingAndSortingRepository<Venue, UUID> {
}
