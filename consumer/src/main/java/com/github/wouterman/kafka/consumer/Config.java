package com.github.wouterman.kafka.consumer;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
public class Config {

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

}