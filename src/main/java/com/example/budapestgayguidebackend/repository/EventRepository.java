package com.example.budapestgayguidebackend.repository;

import com.example.budapestgayguidebackend.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    void deleteAll();

}
