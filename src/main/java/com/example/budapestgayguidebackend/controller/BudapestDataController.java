package com.example.budapestgayguidebackend.controller;

import com.example.budapestgayguidebackend.controller.DTO.BudapestData;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class BudapestDataController {

    @PostMapping("/getdata")
    public BudapestData getBudapestData(@RequestBody BudapestData budapestData){
        System.out.println(budapestData.budapestPlace);
        return budapestData;
    }
}
