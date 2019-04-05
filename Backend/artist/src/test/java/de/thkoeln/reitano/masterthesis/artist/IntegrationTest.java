package de.thkoeln.reitano.masterthesis.artist;

import static org.assertj.core.api.Assertions.assertThat;

import de.thkoeln.reitano.masterthesis.artist.domain.Artist;
import de.thkoeln.reitano.masterthesis.artist.domain.ArtistAlias;
import de.thkoeln.reitano.masterthesis.artist.domain.ArtistRepository;
import de.thkoeln.reitano.masterthesis.artist.domain.FacebookURI;
import de.thkoeln.reitano.masterthesis.artist.domain.Genre;
import de.thkoeln.reitano.masterthesis.artist.domain.MTVURI;
import de.thkoeln.reitano.masterthesis.artist.domain.TwitterURI;
import de.thkoeln.reitano.masterthesis.artist.domain.WebsiteURI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class IntegrationTest {

  @Autowired
  private TestRestTemplate restTemplate;

  @Autowired
  private ArtistRepository artistRepository;

  @Test
  public void getArtistByID_returnsArtistDetails(){

    artistRepository.save(createArtistWithID());

    ResponseEntity<Artist> response = restTemplate.getForEntity("/artists/7610fbcb-952e-4386-8d5d-407a36254bab", Artist.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(response.getBody().getAlias().getAlias()).isEqualTo("Ed Sheeran");
    assertThat(response.getBody().getGenre().getGenre()).isEqualTo("Singer/Songwriter");
    assertThat(response.getBody().getFacebookURI().getFacebookURI().toString()).isEqualTo("http://www.facebook.com/9189674485");
    assertThat(response.getBody().getTwitterURI().getTwitterURI().toString()).isEqualTo("http://www.twitter.com/edsheeran");
  }

  public Artist createArtistWithID()
  {
    Artist artist = new Artist(
        UUID.fromString("7610fbcb-952e-4386-8d5d-407a36254bab"),
        new ArtistAlias("Ed Sheeran"),
        new Genre("Singer/Songwriter"),
        new WebsiteURI("http://www.edsheeran.com/"),
        new FacebookURI("http://www.facebook.com/9189674485"),
        new TwitterURI("http://www.twitter.com/edsheeran"),
        new MTVURI("http://www.mtv.com/artists/ed-sheeran/biography")
    );

    return artist;
  }
}
