package com.example.budapestgayguidebackend.repository;

import com.example.budapestgayguidebackend.model.DTO.VenueFacebookDTO;
import com.example.budapestgayguidebackend.model.Venue;
import com.example.budapestgayguidebackend.model.VenueType;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {


    List<Venue> findVenuesByVenueTypeOrVenueType (VenueType venueType1, VenueType venueType2);
    List<Venue> findVenuesByVenueType (VenueType venueTypes);
    Venue findVenueById(Long id);

}
