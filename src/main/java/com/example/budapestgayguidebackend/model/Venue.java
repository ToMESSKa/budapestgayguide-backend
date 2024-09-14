package com.example.budapestgayguidebackend.model;

import com.example.budapestgayguidebackend.model.DTO.VenueRatingDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.gson.Gson;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Builder
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="venues")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String name;
    public String description;
    public String website;
    public String location;
    public String address;
    public String logoURL;
    public String facebook;
    public String instagram;
    @OneToMany(mappedBy="venue")
    @JsonBackReference
    public List<Event> events;

    @Transient
    public Float googleRating;
    public String googleMapsPlaceId;
    public VenueType venueType;

    public void setGoogleRating(String apiKey) {
        RestTemplate restTemplate = new RestTemplate();
        String saunaGoogleMapsInfo = restTemplate.getForObject("https://places.googleapis.com/v1/places/" + googleMapsPlaceId + "?fields=*&key=" + apiKey, String.class);
        Gson gson = new Gson();
        VenueRatingDTO venueRating = gson.fromJson(saunaGoogleMapsInfo, VenueRatingDTO.class);
        this.googleRating = venueRating.rating;
    }

    public Venue(String facebook) {
        this.facebook = facebook;
    }
}
