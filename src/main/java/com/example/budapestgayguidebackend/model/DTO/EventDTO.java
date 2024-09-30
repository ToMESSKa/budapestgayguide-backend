package com.example.budapestgayguidebackend.model.DTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public ZonedDateTime convertDateString(String dateString) {
        LocalDateTime localDateTime = LocalDateTime.parse(dateString, DATE_TIME_FORMATTER);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Europe/Budapest"));
        return zonedDateTime;
    }
}
