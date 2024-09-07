package com.example.budapestgayguidebackend.service.services;


import com.example.budapestgayguidebackend.model.DTO.VenueFacebookDTO;
import com.example.budapestgayguidebackend.model.VenueType;
import com.example.budapestgayguidebackend.repository.VenueRepository;
import com.example.budapestgayguidebackend.service.interfaces.IVenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.budapestgayguidebackend.model.Venue;

import java.util.List;
@Service
public class VenueService implements IVenueService {

    private final VenueRepository venueRepository;
    @Autowired
    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    @Override
    public List<Venue> findAll(String apiKey) {
        List<Venue> venues = venueRepository.findAll();
//        for (Venue venue : venues) {
//            venue.setGoogleRating(apiKey);
//        }
        return venues;
    }

    @Override
    public List<Venue> findAll() {
        List<Venue> venues = venueRepository.findAll();
//        for (Venue venue : venues) {
//            venue.setGoogleRating(apiKey);
//        }
        return venues;
    }

    @Override
    public List<Venue> findVenuesByVenueTypes (VenueType venueType1, VenueType venueType2 ) {
        List<Venue> venues = venueRepository.findVenuesByVenueTypeOrVenueType(venueType1, venueType2);
        System.out.println(venues);
//        for (Venue venue : venues) {
//            if (venue.googleMapsPlaceId != null)
//            venue.setGoogleRating(apiKey);
//        }
        return venues;
    }

    @Override
    public List<Venue> findVenuesByVenueType (String apiKey, VenueType venueType) {
        List<Venue> venues = venueRepository.findVenuesByVenueType(venueType);
//        for (Venue venue : venues) {
//            venue.setGoogleRating(apiKey);
//        }
        return venues;
    }

    @Override
    public Venue findVenueById(Long venueId) {
        return venueRepository.findVenueById(venueId);
    }


    public void SaveVenue(Venue venue) {
        venueRepository.save(venue);
    }
    }
