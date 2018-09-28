package com.epam.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ITestOrConfiguration
public class AppConfig {

    @Bean
    public Client client(){
        return new Client("2", "New Client");
    }
}
