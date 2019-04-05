//package de.thkoeln.reitano.masterthesis.concert.domain;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.Link;
//import org.springframework.hateoas.Resource;
//import org.springframework.hateoas.ResourceProcessor;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ConcertResourceProcessor  implements ResourceProcessor<Resource<Concert>> {
//
//  @Override
//  public Resource<Concert> process(Resource<Concert> concertResource) {
//
//    concertResource.add(new Link(concertResource.getContent().getArtist().getArtistURI().toString(), "artist"));
//    concertResource.add(new Link(concertResource.getContent().getVenue().getVenueURI().toString(), "venue"));
//
//    return concertResource;
//  }
//}
