package de.thkoeln.reitano.masterthesis.concert.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Concert {

  protected Concert() {
    this.id = UUID.randomUUID();
  }

  @Id
  private UUID id;

  @Embedded
  private Artist artist;

  @Embedded
  private Venue venue;

  @JsonProperty(value = "date")
  private LocalDate concertDate;

  @JsonProperty(value = "begin")
  private LocalTime concertBegin;

  public void reschedule(){}
  public void relocate(){}
  public void cancel(){}
  public void delete(){}
}
