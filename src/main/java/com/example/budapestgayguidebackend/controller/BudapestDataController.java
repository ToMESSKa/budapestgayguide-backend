package com.example.budapestgayguidebackend.controller;

import com.example.budapestgayguidebackend.controller.DTO.Sauna;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class BudapestDataController {

    @GetMapping("/getsaunas")
    public ResponseEntity getSaunaData(){
        return ;
    }
}
