package com.avendra.purs.ExtractData;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;

@Configuration
class MyConfiguration{

    @Bean
    public Instant date(){
        return Instant.now();
    }
}