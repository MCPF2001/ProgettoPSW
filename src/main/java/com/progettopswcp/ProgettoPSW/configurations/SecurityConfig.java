package com.progettopswcp.ProgettoPSW.configurations;

import com.progettopswcp.ProgettoPSW.jwt.CustomJwt;
import com.progettopswcp.ProgettoPSW.jwt.CustomJwtConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfiguration {



    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors(Customizer.withDefaults())
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().authenticated()
                )
                .oauth2ResourceServer((oauth2) -> oauth2.jwt(
                        jwt -> jwt.jwtAuthenticationConverter(customJwtConverter())
                ));
        return http.build();
    }

    @Bean
    public Converter<Jwt, CustomJwt> customJwtConverter() {
        return new CustomJwtConverter();
    }
}