package com.example.budapestgayguidebackend.model;

import com.example.budapestgayguidebackend.model.DTO.VenueRatingDTO;
import com.google.gson.Gson;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.client.RestTemplate;

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
    public String event_creator;
    public String time;
    @ManyToOne    
    @JoinColumn(name = "venue_id", referencedColumnName = "id")
    public Venue venue;
}
