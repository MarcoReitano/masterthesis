//package de.thkoeln.reitano.masterthesis.concert.controller;
//
//import de.thkoeln.reitano.masterthesis.concert.domain.ArtistRepository;
//import de.thkoeln.reitano.masterthesis.concert.domain.ConcertRepository;
//import de.thkoeln.reitano.masterthesis.concert.domain.VenueRepository;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.data.rest.webmvc.RepositoryRestController;
//
//@RepositoryRestController
//public class ConcertController {
//
//  Logger logger = LoggerFactory.getLogger(ConcertController.class);
//
//  private final ConcertRepository concertRepository;
//  private final ArtistRepository artistRepository;
//  private final VenueRepository venueRepository;
//
//
//  public ConcertController(
//      ConcertRepository concertRepository,
//      ArtistRepository artistRepository,
//      VenueRepository venueRepository) {
//    this.concertRepository = concertRepository;
//    this.artistRepository = artistRepository;
//    this.venueRepository = venueRepository;
//  }
//
////  @RequestMapping(method = RequestMethod.POST, value = "concerts")
////  public @ResponseBody
////  ResponseEntity<?> postConcert(@RequestBody Concert postedConcert) {
////
////    logger.info(postedConcert.getConcertBegin().toString());
////    logger.info(postedConcert.getId().toString());
////    logger.info(postedConcert.getArtist().getAlias());
////    logger.info(postedConcert.getArtist().getArtistURI().toString());
////    logger.info(postedConcert.getConcertBegin().toString());
//////    URI artist = postedConcert.getArtist().getArtistURI();
//////    final Optional<Artist> artistEntity = artistRepository.findById(artist);
//////
//////    URI venue = postedConcert.getVenue().getVenueURI();
//////    final Optional<Venue> venueEntity = venueRepository.findById(venue);
//////
//////    postedConcert.setArtist(artistEntity.get());
//////    postedConcert.setVenue(venueEntity.get());
//////
//////    concertRepository.save(postedConcert);
////
////    return ResponseEntity.created(URI.create("http://www.foobar.com")).body("BLA");
////  }
//
//}
