package com.example.budapestgayguidebackend.service.interfaces;

import com.example.budapestgayguidebackend.model.Sauna;

import java.util.List;
public interface ISaunaService {

    List<Sauna> findAll(String apiKey);
}
