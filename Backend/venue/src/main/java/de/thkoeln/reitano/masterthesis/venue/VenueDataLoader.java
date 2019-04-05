package de.thkoeln.reitano.masterthesis.venue;

import de.thkoeln.reitano.masterthesis.venue.domain.Address;
import de.thkoeln.reitano.masterthesis.venue.domain.City;
import de.thkoeln.reitano.masterthesis.venue.domain.Country;
import de.thkoeln.reitano.masterthesis.venue.domain.Street;
import de.thkoeln.reitano.masterthesis.venue.domain.StreetNumber;
import de.thkoeln.reitano.masterthesis.venue.domain.Venue;
import de.thkoeln.reitano.masterthesis.venue.domain.VenueRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;

@Component
public class VenueDataLoader implements ApplicationRunner {

  Logger logger = LoggerFactory.getLogger(VenueDataLoader.class);

  private final VenueRepository venueRepository;

  @Autowired
  public VenueDataLoader(VenueRepository venueRepository)
  {
    this.venueRepository = venueRepository;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Address palladiumAdress = new Address(
        new Street("Schanzenstraße"),
        new StreetNumber("36"),
        new City("Köln"),
        new Country("Deutschland")
    );
    Venue venue = new Venue(
        UUID.fromString("9fcd8c3d-7e57-47a4-a877-3f96d501de4f"),"Palladium", palladiumAdress);

    venueRepository.save(venue);

    Address liveMusicHallAdress = new Address(
        new Street("Lichtstraße"),
        new StreetNumber("30"),
        new City("Köln"),
        new Country("Deutschland")
    );

    Venue liveMusicHall = new Venue(
        UUID.fromString("a16e783b-cb71-4060-a1eb-460ff08013f2"),"Live Music Hall",
        liveMusicHallAdress);

    venueRepository.save(liveMusicHall);
  }
}
