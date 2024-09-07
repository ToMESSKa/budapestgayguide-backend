package com.example.budapestgayguidebackend.controller;

import com.example.budapestgayguidebackend.model.DTO.EventDTO;
import com.example.budapestgayguidebackend.model.DTO.VenueFacebookDTO;
import com.example.budapestgayguidebackend.model.Event;
import com.example.budapestgayguidebackend.model.Venue;
import com.example.budapestgayguidebackend.model.VenueType;
import com.example.budapestgayguidebackend.repository.EventRepository;
import com.example.budapestgayguidebackend.service.services.EventService;
import com.example.budapestgayguidebackend.service.services.VenueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins= {"https://bdpstgg.web.app", "https://localhost:3000", "http://localhost:8080", "http://127.0.0.1" }, maxAge = 4800 )
@RestController
@Slf4j
public class GayGuideController {


    private final EventService eventService;
    private final EventRepository eventRepository;
    //    @Value("${apiKey}")
    private String apiKey;

    private VenueService venueService;

    @Autowired GayGuideController(VenueService venueService, EventService eventService, EventRepository eventRepository){
        this.venueService = venueService;
        this.eventService = eventService;
        this.eventRepository = eventRepository;
    }

    @RequestMapping("/getsaunas")
    public List<Venue> getSaunaData(){
        return venueService.findVenuesByVenueType(apiKey, VenueType.SAUNA);
    }

    @RequestMapping("/getbars")
    public List<Venue> getBarData(){
        return venueService.findVenuesByVenueType(apiKey, VenueType.BAR);
    }

    @RequestMapping("/getclubsandparties")
    public List<Venue>getClubAndPartiesData(){
        return venueService.findVenuesByVenueTypes(VenueType.PARTY, VenueType.CLUB);
    }


    @RequestMapping("/getvenuesfacebook")
    public List<VenueFacebookDTO> getVenuesFacebook(){
        List<VenueFacebookDTO> facebooks = new ArrayList<>();
        List<Venue> venuesFacebook = venueService.findAll();
        for (Venue venue : venuesFacebook) {
            if (venue.getFacebook() != null){
                VenueFacebookDTO facebook = new VenueFacebookDTO();
                facebook.setFacebook(venue.getFacebook());
                facebook.setId(venue.getId());
                facebooks.add(facebook);
            }
        }
        return facebooks;
    }

    @RequestMapping("/getevents")
    public void getEvents(@RequestBody List<EventDTO> events){
        for (EventDTO eventDTO : events){
            Venue venue = venueService.findVenueById(Long.valueOf(eventDTO.venue_id));

            Event event = Event.builder()
                    .name(eventDTO.getName())
                    .url(eventDTO.getUrl())
                    .location(eventDTO.getLocation())
                    .event_creator(eventDTO.getEvent_creator())
                    .time(eventDTO.getTime())
                    .venue(venue)
                    .build();
            eventRepository.save(event);
        }
    }

}
