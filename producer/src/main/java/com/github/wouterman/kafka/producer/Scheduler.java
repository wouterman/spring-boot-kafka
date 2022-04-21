package com.github.wouterman.kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Scheduler {

  private final KafkaTemplate<String, String> kafkaTemplate;
  private Integer count = 0;

  @Scheduled(fixedRate = 1000)
  public void sendMessage() {
    count++;
    kafkaTemplate.send("scheduled", "message " + count);
    log.info("sent message count {}", count);
  }

}