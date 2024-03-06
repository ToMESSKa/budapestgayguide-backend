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
                saunaSzauna69.setDescription("Nice gay sauna for younger gays.");
                saunaSzauna69.setName("Szauna69");
                saunaService.SaveSauna(saunaSzauna69);

                Sauna saunaMagnum = Sauna.builder().build();
                saunaMagnum.setDescription("Nice gay sauna for older gays.");
                saunaMagnum.setName("Magnum Sauna");
                saunaService.SaveSauna(saunaMagnum);

                Sauna saunaRudas = Sauna.builder().build();
                saunaRudas.setDescription("Unofficial gay sauna for gays or conservative politicians.");
                saunaRudas.setName("Magnum Sauna");
                saunaService.SaveSauna(saunaRudas);
        };
    }
}
