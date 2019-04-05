package de.thkoeln.reitano.masterthesis.artist;

import de.thkoeln.reitano.masterthesis.artist.domain.Artist;
import de.thkoeln.reitano.masterthesis.artist.domain.ArtistAlias;
import de.thkoeln.reitano.masterthesis.artist.domain.ArtistRepository;
import de.thkoeln.reitano.masterthesis.artist.domain.FacebookURI;
import de.thkoeln.reitano.masterthesis.artist.domain.Genre;
import de.thkoeln.reitano.masterthesis.artist.domain.MTVURI;
import de.thkoeln.reitano.masterthesis.artist.domain.TwitterURI;
import de.thkoeln.reitano.masterthesis.artist.domain.WebsiteURI;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.UUID;


import javax.imageio.ImageIO;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

@Component
public class ArtistDataLoader implements ApplicationRunner {

  Logger logger = LoggerFactory.getLogger(ArtistDataLoader.class);

  private final ArtistRepository artistRepository;

  @Value(value = "classpath:artistsdata/10000-MTV-Music-Artists-page-1.csv")
  private Resource artistData;

  @Autowired
  public ArtistDataLoader(ArtistRepository artistRepository) {
    this.artistRepository = artistRepository;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {

    Artist edSheeran = new Artist(
        UUID.fromString("59e65228-7751-4671-ac3d-558eb4f1b674"),
        new ArtistAlias("Ed Sheeran"),
        new Genre("Singer/Songwriter"),
        new WebsiteURI("http://www.edsheeran.com/"),
        new FacebookURI("http://www.facebook.com/9189674485"),
        new TwitterURI("http://www.twitter.com/edsheeran"),
        new MTVURI("http://www.mtv.com/artists/ed-sheeran/biography"));

    artistRepository.save(edSheeran);

    logger.info(artistData.getFilename());
    ObjectMapper mapper = new CsvMapper();
    CsvSchema schema = CsvSchema.builder()
        .addColumn("alias")
        .addColumn("facebookURI")
        .addColumn("twitterURI")
        .addColumn("websiteURI")
        .addColumn("genre")
        .addColumn("mtvURI")
        .setUseHeader(true)
        .build();

    MappingIterator<Artist> iterator = mapper.readerFor(Artist.class).with(schema).with(CsvParser.Feature.TRIM_SPACES).readValues(artistData.getInputStream());

    while (iterator.hasNextValue()) {
      try {
        Artist artist = iterator.nextValue();

        //fetchProfilePicture(artist);

        artistRepository.save(artist);
      } catch (Exception ex) {
        logger.info(ex.getMessage());
      }
    }
  }

  private void fetchProfilePicture(Artist artist){
    try {
      String uuid = artist.getId().toString();
      String facebookURI = artist.getFacebookURI().getFacebookURI().toString();
      logger.info("Fetching: " + facebookURI);
      final Document document = Jsoup.connect(facebookURI).get();
      logger.info(document.toString());
      Element profileImg = document.select(".scaledImageFitWidth").first();
      String pictureUri = profileImg.attr("src");

      BufferedImage image = ImageIO.read(new URL(pictureUri));

      String filename = UUID.nameUUIDFromBytes(facebookURI.getBytes()).toString();
      File outputFile = new File("C:/test/".concat(filename).concat(".jpg"));
      ImageIO.write(image, "jpg", outputFile);

      logger.info(pictureUri);

    } catch (IOException e) {
      logger.info(e.getMessage());
    }
  }
}
