package de.thkoeln.reitano.masterthesis.venue.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;

@CrossOrigin(origins = "*")
@RepositoryRestResource(path="venues")
public interface VenueRepository extends PagingAndSortingRepository<Venue, UUID> {
}
