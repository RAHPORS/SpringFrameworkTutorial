package com.rahpors.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ramon on 25/08/17.
 */

@Configuration
public class AppConfig {
    @Bean
    public Mundo mundo (){
        return new Mundo();
    }
}
