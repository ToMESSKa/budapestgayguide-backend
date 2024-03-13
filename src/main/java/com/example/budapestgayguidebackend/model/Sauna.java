package com.example.budapestgayguidebackend.model;

import com.example.budapestgayguidebackend.model.DTO.SaunaRatingDTO;
import com.google.gson.Gson;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.client.RestTemplate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="saunas")
public class Sauna {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sauna_id;
    public String name;
    public String description;
    public String website;
    public String location;
    public String address;
    public String logoURL;
    @Transient
    public Float googleRating;
    public String googleMapsPlaceId;

    public void setGoogleRating(String apiKey) {
        RestTemplate restTemplate = new RestTemplate();
        String saunaGoogleMapsInfo = restTemplate.getForObject("https://places.googleapis.com/v1/places/" + googleMapsPlaceId + "?fields=*&key=" + apiKey, String.class);
        Gson gson = new Gson();
        SaunaRatingDTO saunaRating = gson.fromJson(saunaGoogleMapsInfo, SaunaRatingDTO.class);
        this.googleRating = saunaRating.rating;
    }




}
