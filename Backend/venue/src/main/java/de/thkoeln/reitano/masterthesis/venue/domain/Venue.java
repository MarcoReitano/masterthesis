package de.thkoeln.reitano.masterthesis.venue.domain;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Venue {

  protected Venue(){
    this.id = UUID.randomUUID();
  }

  @Id
  private UUID id;

  private String name;

  @Embedded
  private Address address;
}
