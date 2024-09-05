package com.example.budapestgayguidebackend.controller;

import com.example.budapestgayguidebackend.service.services.AccountService;
import com.example.budapestgayguidebackend.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import static com.example.budapestgayguidebackend.model.DTO.AccountDto.convertToDto;

@RestController
@RequestMapping("/v1/oauth")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/user/info")
    public ResponseEntity getUserInfo(Principal principal) {
        System.out.println("endpoint");
        Account account = accountService.getAccount(Long.valueOf(principal.getName()));
        return ResponseEntity.ok().body(convertToDto(account));
    }
}