package com.example.budapestgayguidebackend.service.services;


import com.example.budapestgayguidebackend.model.Event;
import com.example.budapestgayguidebackend.repository.EventRepository;
import com.example.budapestgayguidebackend.service.interfaces.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements IEventService {

    private final EventRepository eventRepository;
    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public void deleteAll() {
        eventRepository.deleteAll();
    }


    public void save(Event event) {
        eventRepository.save(event);
    }

    @Override
    public List<Event> findAllByOrderByTimeAsc() {
        return eventRepository.findAllByOrderByTimeAsc();
    }
}
