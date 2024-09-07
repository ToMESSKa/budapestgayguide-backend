package com.example.budapestgayguidebackend.service.interfaces;

import com.example.budapestgayguidebackend.model.DTO.VenueFacebookDTO;
import com.example.budapestgayguidebackend.model.Venue;
import com.example.budapestgayguidebackend.model.VenueType;

import java.util.List;

public interface IVenueService {

    List<Venue> findAll(String apiKey);
    List<Venue> findAll();
    List<Venue> findVenuesByVenueTypes (VenueType venueType1, VenueType venueType2);
    List<Venue> findVenuesByVenueType (String apiKey, VenueType venueTypes);
    Venue findVenueById(Long venueId);
}

