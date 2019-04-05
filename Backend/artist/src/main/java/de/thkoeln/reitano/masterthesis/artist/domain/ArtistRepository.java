package de.thkoeln.reitano.masterthesis.artist.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*")
@RepositoryRestResource(path = "artists")
public interface ArtistRepository extends PagingAndSortingRepository<Artist, UUID> {
//  List<Artist> findByName(@Param("tourName") String tourName);
}
