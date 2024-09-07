package com.example.budapestgayguidebackend.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
public class SecurityConfiguration {

    private final JWTRequestFilter jwtRequestFilter;

    public SecurityConfiguration(JWTRequestFilter jwtRequestFilter) {
        this.jwtRequestFilter = jwtRequestFilter;
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
                http.cors();
                 http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                        .ignoringRequestMatchers("/v1/oauth/login");
            http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
            http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
        ///http.authorizeRequests().requestMatchers("/v1/oauth/login").permitAll().anyRequest().authenticated();
        http
                .csrf().disable().authorizeRequests().requestMatchers("/saunas", "/getbars").permitAll();

        return http.build();
    }


}