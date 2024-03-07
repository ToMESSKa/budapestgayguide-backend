package com.example.budapestgayguidebackend.configuration;

import com.example.budapestgayguidebackend.model.Sauna;
import com.example.budapestgayguidebackend.repository.SaunaRepository;
import com.example.budapestgayguidebackend.service.services.SaunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GayGuideConfiguration {

        @Autowired
        SaunaService saunaService;
        @Bean
        CommandLineRunner commandLineRunner () {
            return args -> {
                Sauna saunaSzauna69 = Sauna.builder().build();
                saunaSzauna69.setDescription("Budapest‘s favourite men only sauna among young gay men. Established in 2004.");
                saunaSzauna69.setName("Szauna69");
                saunaSzauna69.setWebsite("https://gaysaunabudapest.hu/en/");
                saunaSzauna69.setAddress("1094 Budapest, Angyal utca 2.");
                saunaSzauna69.setLocation("https://maps.app.goo.gl/dR2TPh8jMinooofu5");
                saunaSzauna69.setLogoURL("/images/saunas/szauna69.png");

                saunaService.SaveSauna(saunaSzauna69);

                Sauna saunaMagnum = Sauna.builder().build();
                saunaMagnum.setDescription("Magnum Sauna has been welcoming gay and bisexual men in Budapest since 2001. They offer Budapest's largest steam room, jacuzzi, sauna experiences and the largest cruising area in the city");
                saunaMagnum.setName("Magnum Szauna");
                saunaMagnum.setWebsite("https://gaysaunabudapest.com/en/");
                saunaMagnum.setAddress("1085 Budapest, Csepreghy u. 2.");
                saunaMagnum.setLocation("https://maps.app.goo.gl/h9qTRJk4GDwd4cFE6");
                saunaMagnum.setLogoURL("images/saunas/magnum.png");
                saunaService.SaveSauna(saunaMagnum);

                Sauna saunaRudas = Sauna.builder().build();
                saunaRudas.setDescription("Unofficial gay sauna for gays or conservative politicians.");
                saunaRudas.setName("Rudas Gyógyfürdő és Uszoda");
                saunaRudas.setWebsite("https://en.rudasfurdo.hu");
                saunaRudas.setAddress("1013 Budapest, Döbrentei tér 9.");
                saunaRudas.setLocation("https://maps.app.goo.gl/Z4A91fexeRbRBgJZ6");
                saunaRudas.setLogoURL("/images/saunas/rudas.svg");
                saunaService.SaveSauna(saunaRudas);
        };
    }
}
