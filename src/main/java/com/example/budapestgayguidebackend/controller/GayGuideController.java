package com.example.budapestgayguidebackend.controller;

import com.example.budapestgayguidebackend.model.Sauna;
import com.example.budapestgayguidebackend.repository.SaunaRepository;
import com.example.budapestgayguidebackend.service.services.SaunaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"http://localhost:3000"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@Slf4j
public class GayGuideController {

    private SaunaService saunaService;

    @Autowired GayGuideController(SaunaService saunaService){
        this.saunaService = saunaService;
    }


    @RequestMapping("/getsaunas")
    public List<Sauna> getSaunaData(){
        return saunaService.findAll();
    }
}
