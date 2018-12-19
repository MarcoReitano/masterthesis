package de.thkoeln.reitano.masterthesis.artist;

import de.thkoeln.reitano.masterthesis.artist.domain.Artist;
import de.thkoeln.reitano.masterthesis.artist.domain.ArtistRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

@Component
public class ArtistDataLoader implements ApplicationRunner {

  Logger logger = LoggerFactory.getLogger(ArtistDataLoader.class);

  private final ArtistRepository artistRepository;

  @Value(value = "classpath:artistsdata/10000-MTV-Music-Artists-page-1.csv")
  private Resource artistData;

  @Autowired
  public ArtistDataLoader(ArtistRepository artistRepository)
  {
    this.artistRepository = artistRepository;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    logger.info(artistData.getFilename());

    ObjectMapper mapper = new CsvMapper();
    mapper.addMixIn(Artist.class, ArtistsCsvMixin.class);
    CsvSchema schema = CsvSchema.builder()
        .addColumn("name")
        .addColumn("facebook")
        .addColumn("twitter")
        .addColumn("website")
        .addColumn("genre")
        .addColumn("mtv")
        .build();

    MappingIterator<Artist> iterator = mapper.readerFor(Artist.class).with(schema).readValues(artistData.getFile());

    while (iterator.hasNextValue()) {
      try {
        Artist artist = iterator.nextValue();
//        logger.info(artist.getId().toString());
//        logger.info(artist.getAlias().toString());
//        logger.info(artist.getGenre().toString());
//        logger.info(artist.getFacebookURI().toString());
//        logger.info(artist.getTwitterURI().toString());

        artistRepository.save(artist);
      } catch (Exception ex) {
        logger.info(ex.getMessage());
      }
    }
  }
}
