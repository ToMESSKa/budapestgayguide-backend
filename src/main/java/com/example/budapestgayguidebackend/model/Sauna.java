package com.example.budapestgayguidebackend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

}
