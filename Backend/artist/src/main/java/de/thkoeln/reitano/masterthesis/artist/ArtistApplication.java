package de.thkoeln.reitano.masterthesis.artist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.ForwardedHeaderFilter;

@SpringBootApplication
public class ArtistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtistApplication.class, args);
	}
}

