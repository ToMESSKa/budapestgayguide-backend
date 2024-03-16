package com.example.budapestgayguidebackend.controller;

import com.example.budapestgayguidebackend.model.DTO.SaunaRatingDTO;
import com.example.budapestgayguidebackend.model.Sauna;
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


    @RequestMapping("/getsaunas")
    public List<Sauna> getSaunaData(){
        System.out.println(saunaService.findAll(apiKey));
        return saunaService.findAll(apiKey);
    }

}
