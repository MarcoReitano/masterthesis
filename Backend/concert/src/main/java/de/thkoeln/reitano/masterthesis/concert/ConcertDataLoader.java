package de.thkoeln.reitano.masterthesis.concert;

import de.thkoeln.reitano.masterthesis.concert.domain.Artist;
import de.thkoeln.reitano.masterthesis.concert.domain.ArtistRepository;
import de.thkoeln.reitano.masterthesis.concert.domain.Concert;
import de.thkoeln.reitano.masterthesis.concert.domain.ConcertRepository;
import de.thkoeln.reitano.masterthesis.concert.domain.Venue;
import de.thkoeln.reitano.masterthesis.concert.domain.VenueRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Component
public class ConcertDataLoader implements ApplicationRunner {

  Logger logger = LoggerFactory.getLogger(ConcertDataLoader.class);

  private final ConcertRepository concertRepository;
  private final ArtistRepository artistRepository;
  private final VenueRepository venueRepository;


  @Autowired
  public ConcertDataLoader(ConcertRepository concertRepository,
      ArtistRepository artistRepository,
      VenueRepository venueRepository){
    this.concertRepository = concertRepository;
    this.artistRepository = artistRepository;
    this.venueRepository = venueRepository;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Artist edSheeran = new Artist(URI.create("http://localhost:8080/artists/59e65228-7751-4671-ac3d-558eb4f1b674"), "Ed Sheeran");
    artistRepository.save(edSheeran);

    Venue palladium = new Venue(URI.create("http://localhost:8081/venues/9fcd8c3d-7e57-47a4-a877-3f96d501de4f"), "Palladium");
    venueRepository.save(palladium);
    Venue liveMusicHall = new Venue(URI.create("http://localhost:8081/venues/a16e783b-cb71-4060-a1eb-460ff08013f2"), "Live Music Hall");
    venueRepository.save(liveMusicHall);

    Concert concert = new Concert(
        UUID.randomUUID(),
        edSheeran,
        palladium,
        LocalDate.of(2019,12, 1),
        LocalTime.of(20, 00)
    );
    concertRepository.save(concert);

    Concert concert2 = new Concert(
        UUID.randomUUID(),
        edSheeran,
        liveMusicHall,
        LocalDate.of(2019,12, 2),
        LocalTime.of(20, 00)
    );
    concertRepository.save(concert2);
  }
}
