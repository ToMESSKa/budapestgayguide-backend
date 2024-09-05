package com.example.budapestgayguidebackend.configuration;

import com.example.budapestgayguidebackend.model.Event;
import com.example.budapestgayguidebackend.model.Venue;
import com.example.budapestgayguidebackend.model.VenueType;
import com.example.budapestgayguidebackend.service.services.EventService;
import com.example.budapestgayguidebackend.service.services.VenueService;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GayGuideConfiguration {

        @Autowired
        VenueService venueService;

        @Autowired
        EventService eventService;


        @Bean
        CommandLineRunner commandLineRunner () {
            return args -> {
                Venue saunaSzauna69 = Venue.builder()
                .description("Budapest‘s favourite men only sauna among young gay men. Established in 2004.")
                .name("Szauna69")
                .website("https://gaysaunabudapest.hu/en/")
                .address("1094 Budapest, Angyal utca 2.")
                .location("https://maps.app.goo.gl/dR2TPh8jMinooofu5")
                .logoURL("/images/saunas/szauna69.png")
                .facebook("https://www.facebook.com/szauna69/")
                .venueType(VenueType.SAUNA)
                .googleMapsPlaceId("ChIJd07TVP_cQUcRRnu6xKo9l-w").build();

                venueService.SaveVenue(saunaSzauna69);

                Venue saunaMagnum = Venue.builder()
                        .description("Magnum Sauna has been welcoming gay and bisexual men in Budapest since 2001. They offer Budapest's largest steam room, jacuzzi, sauna experiences and the largest cruising area in the city")
                .name("Magnum Szauna")
                .website("https://gaysaunabudapest.com/en/")
                .address("1085 Budapest, Csepreghy utca 2.")
                .location("https://maps.app.goo.gl/h9qTRJk4GDwd4cFE6")
                .logoURL("images/saunas/magnum.png")
                        .venueType(VenueType.SAUNA)
                .googleMapsPlaceId("ChIJoeHlp1ncQUcRvpWWYbKO3OY")
                .facebook("https://www.facebook.com/magnumsauna/")
                .build();
                venueService.SaveVenue(saunaMagnum);

                Venue saunaRudas = Venue.builder()
                        .description("Unofficial gay sauna for gays or conservative politicians.")
                        .name("Rudas Gyógyfürdő és Uszoda")
                        .website("https://en.rudasfurdo.hu")
                        .address("1013 Budapest, Döbrentei tér 9.")
                        .venueType(VenueType.SAUNA)
                        .location("https://maps.app.goo.gl/Z4A91fexeRbRBgJZ6")
                        .logoURL("/images/saunas/rudas.svg")
                        .googleMapsPlaceId("ChIJvwc6eUjcQUcRevigwh1jDOM")
                .build();
                venueService.SaveVenue(saunaRudas);

                Venue barHabrolo = Venue.builder()
                .description("Since 2006, we have been operating as one of the oldest gay bars in downtown Budapest. Our goal is to make all our guests feel at home, whether they want to party or just have a good conversation")
                .name("Habroló Café & Bar")
                .website("https://www.habrolo.hu/")
                        .venueType(VenueType.BAR)
                .address("1075 Budapest, Síp u. 5.")
                .facebook("https://www.facebook.com/Habrolo/")
                .location("https://maps.app.goo.gl/jbZp8GqPALBNHhUz7")
                        .logoURL("/images/bars/habrolo.png")
                        .googleMapsPlaceId("ChIJ6_Oij0PcQUcRpJTPdjpO_kk")
                        .build();

                venueService.SaveVenue(barHabrolo);

                Venue barWhynot = Venue.builder()
                .description("The Why Not Café and Bar at the Danube embankment in Budapest have changed to a completely new design on 2016 April for the customers to make it more homelike and comfortable for them.")
                .name("Why Not Café & Bar")
                .website("https://www.habrolo.hu/")
                        .venueType(VenueType.BAR)
                .address("1056 Budapest, Belgrád rkp. 3-4")
                .facebook("https://www.facebook.com/whynotbudapest/")
                .location("https://maps.app.goo.gl/LamHSkByX1HxZakN8")
                .logoURL("/images/bars/whynot.png")
                .googleMapsPlaceId("ChIJ9Yq_kk_cQUcRZ_dxGvDfL0Y").build();

                venueService.SaveVenue(barWhynot);


                Venue barCoxx = Venue.builder()
                .description("The biggest cruising bar in Budapest")
                .name("CoXx Men's Bar")
                .address("1047 Budapest, Dohány u. 38")
                        .venueType(VenueType.BAR)
                .location("https://maps.app.goo.gl/jwxgZEQtAe2i1wFx7")
                .logoURL("/images/bars/coxx.png")
                        .facebook("https://www.facebook.com/profile.php?id=100066888414130&sk=")
                .googleMapsPlaceId("ChIJtzeUX13cQUcRuPTQ9NRQx_s")
                .build();

                venueService.SaveVenue(barCoxx);

                Venue clubAlterego = Venue.builder()
                .description("The Alterego Gay Club in Budapest is one of the most well-known and popular gay entertainment venues, having served the community for 15 years. ")
                .name("Alterego Gay Club Budapest")
                        .venueType(VenueType.CLUB)
                .address("1066 Budapest, Dessewffy u. 33.")
                        .website("http://www.alteregoclub.hu/en/club")
                        .location("https://maps.app.goo.gl/kj9SSjuQg26KaeGa7")
                        .facebook("https://www.facebook.com/alteregoclubbudapest/")
                        .logoURL("/images/clubs/alterego.png")
                        .googleMapsPlaceId("ChIJxa4F4GzcQUcRkTg_tMC6FW4")
                        .build();
                venueService.SaveVenue(clubAlterego);

                Venue clubFreedom = Venue.builder()
                        .description("Tiny club with drag shows.")
                        .name("Freedom Club")
                        .venueType(VenueType.CLUB)
                        .address("1085 Budapest, Rökk Szilárd u. 14.")
                        .instagram("https://www.instagram.com/freedomclub.bp/")
                        .facebook("https://www.facebook.com/Rainbow.TheCoffee.TheClub/")
                        .location("https://maps.app.goo.gl/AQLbtgvLvrYEPz577")
                        .logoURL("/images/clubs/freedom.png")
                        .googleMapsPlaceId("ChIJb9fLZXvdQUcRRPC7U07iQy8")
                        .build();

                venueService.SaveVenue(clubFreedom);

                Venue partyHello = Venue.builder()
                        .description("POPQUEERS IN THE NIGHT! Funny and trashy popnight for Queers, Barbie Dolls, Aliens and their friends.")
                        .name("HELLO")
                        .venueType(VenueType.PARTY)
                        .facebook("https://www.facebook.com/hellopartybp/")
                        .logoURL("/images/parties/hello.png")
                        .build();

                venueService.SaveVenue(partyHello);

                Venue partyGarcons = Venue.builder()
                        .description("A gay party for fashion junkies, posers, models, art-heads and other freaks.")
                        .name("Garçons")
                        .venueType(VenueType.PARTY)
                        .instagram("https://www.instagram.com/garconsbudapest/")
                        .facebook("https://www.facebook.com/garconsbudapest/")
                        .logoURL("/images/parties/garcons.png")
                        .build();

                venueService.SaveVenue(partyGarcons);

                Venue partyTriton = Venue.builder()
                        .description("Budapest’s hottest gay party. International DJs, themes, main show, stage production, play area.")
                        .name("Triton")
                        .venueType(VenueType.PARTY)
                        .instagram("https://www.instagram.com/tritoneventsgroup/")
                        .facebook("https://www.facebook.com/tritoneventsgroup/")
                        .logoURL("/images/parties/triton.png")
                        .build();

                venueService.SaveVenue(partyTriton);

                Venue partyPolygon = Venue.builder()
                        .description("A party series where you can be yourself.")
                        .name("Polygon Club")
                        .venueType(VenueType.PARTY)
                        .instagram("https://www.instagram.com/polygon_theclub")
                        .facebook("https://www.facebook.com/polygontheclub/")
                        .logoURL("/images/parties/polygon.png")
                        .build();

                venueService.SaveVenue(partyPolygon);

                Venue partyLostInTechno = Venue.builder()
                        .description("Queer techo party")
                        .name("Lost In Techno")
                        .venueType(VenueType.PARTY)
                        .instagram("https://www.instagram.com/tritoneventsgroup/")
                        .facebook("https://www.facebook.com/lostintechnolostintechno/")
                        .logoURL("/images/parties/lostintechno.png")
                        .build();

                venueService.SaveVenue(partyLostInTechno);

                Venue partyLudus = Venue.builder()
                        .description("Biggest open-air queer party")
                        .name("Ludus")
                        .venueType(VenueType.PARTY)
                        .instagram("https://www.instagram.com/ludusbudapest")
                        .facebook("https://www.facebook.com/ludusbudapest/")
                        .logoURL("/images/parties/ludus.png")
                        .build();

                venueService.SaveVenue(partyLudus);


                Venue partyDirtycash = Venue.builder()
                        .description("Queering the dancefloors of Budapest since 2023.")
                        .name("Dirty Cash")
                        .venueType(VenueType.PARTY)
                        .instagram("https://www.instagram.com/dirtycashbudapest/")
                        .facebook("https://www.instagram.com/dirtycashbudapest/")
                        .logoURL("/images/parties/dirtycash.png")
                        .build();

                venueService.SaveVenue(partyDirtycash);

                Venue partyOkama = Venue.builder()
                        .description("Queering the dancefloors of Budapest since 2023.")
                        .name("Okama")
                        .venueType(VenueType.PARTY)
                        .instagram("https://www.instagram.com/okamabudapest")
                        .facebook("https://www.facebook.com/okamabudapest/")
                        .logoURL("/images/parties/dirtycash.png")
                        .build();

                venueService.SaveVenue(partyOkama);

                Event testEvent = Event.builder().event_id(1L)
                        .event_creator("test creator")
                        .name("test event")
                        .url("https://www.test.com/test")
                        .location("test location")
                        .time("test time")
                        .venue(partyOkama)
                        .build();

                eventService.SaveEvent(testEvent);

                Event testEvent2 = Event.builder().event_id(2L)
                        .event_creator("test creator2")
                        .name("test event2")
                        .url("https://www.test2.com/test2")
                        .location("test location2")
                        .time("test time2")
                        .venue(barCoxx)
                        .build();

                eventService.SaveEvent(testEvent2);
        };
    }
}
