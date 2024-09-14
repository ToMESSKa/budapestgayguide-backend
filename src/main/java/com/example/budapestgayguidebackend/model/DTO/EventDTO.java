package com.example.budapestgayguidebackend.model.DTO;

import com.example.budapestgayguidebackend.model.Venue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@EqualsAndHashCode
@Setter
public class EventDTO {

    public Long event_id;
    public String name;
    public String url;
    public String location;
    public String time;
    public String venue_id;

}
