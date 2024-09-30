package com.example.budapestgayguidebackend.model;

import com.example.budapestgayguidebackend.model.DTO.VenueRatingDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.gson.Gson;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

@Builder
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long event_id;
    public String name;
    public String url;
    public String location;
    public ZonedDateTime time;
    @ManyToOne    
    @JoinColumn(name = "venue_id", referencedColumnName = "id")
    public Venue venue;
}
