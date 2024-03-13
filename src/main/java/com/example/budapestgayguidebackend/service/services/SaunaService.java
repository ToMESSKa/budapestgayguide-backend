package com.example.budapestgayguidebackend.service.services;

import com.example.budapestgayguidebackend.model.Sauna;
import com.example.budapestgayguidebackend.repository.SaunaRepository;
import com.example.budapestgayguidebackend.service.interfaces.ISaunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaunaService implements ISaunaService {

    private final SaunaRepository saunaRepository;
    @Autowired
    public SaunaService(SaunaRepository saunaRepository) {
        this.saunaRepository = saunaRepository;
    }

    @Override
    public List<Sauna> findAll(String apiKey) {
        List<Sauna> saunas = saunaRepository.findAll();
        for (Sauna sauna : saunas) {
            sauna.setGoogleRating(apiKey);
        }
        return saunas;
    }

    public void SaveSauna(Sauna sauna) {
        saunaRepository.save(sauna);
    }
    }
