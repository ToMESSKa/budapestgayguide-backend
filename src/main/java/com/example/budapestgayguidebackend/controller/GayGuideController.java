package com.example.budapestgayguidebackend.controller;

import com.example.budapestgayguidebackend.model.DTO.SaunaReviewDTO;
import com.example.budapestgayguidebackend.model.Sauna;
import com.example.budapestgayguidebackend.repository.SaunaRepository;
import com.example.budapestgayguidebackend.service.services.SaunaService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@CrossOrigin(origins= {"http://localhost:3000"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@Slf4j
public class GayGuideController {

    @Value("${apiKey}")
    private String apiKey;

    private SaunaService saunaService;

    @Autowired GayGuideController(SaunaService saunaService){
        this.saunaService = saunaService;
    }

    RestTemplate restTemplate = new RestTemplate();


    @RequestMapping("/getsaunas")
    public List<Sauna> getSaunaData(){
        String saunaRating = restTemplate.getForObject("https://places.googleapis.com/v1/places/ChIJoeHlp1ncQUcRvpWWYbKO3OY?fields=*&key=" + apiKey, String.class);
        Gson gson = new Gson();
        SaunaReviewDTO saunaM = gson.fromJson(saunaRating, SaunaReviewDTO.class);

        System.out.println(saunaM.rating);
        System.out.println(saunaRating);
        return saunaService.findAll();
    }


}
