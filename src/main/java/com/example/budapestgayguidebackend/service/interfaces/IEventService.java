package com.example.budapestgayguidebackend.service.interfaces;

import com.example.budapestgayguidebackend.model.Event;

import java.util.List;

public interface IEventService {

    List<Event> findAll();
    void deleteAll();
}

