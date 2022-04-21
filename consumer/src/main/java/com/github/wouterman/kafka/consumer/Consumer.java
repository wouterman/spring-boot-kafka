package com.github.wouterman.kafka.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Consumer {

  private final ObjectMapper objectMapper;
  private final FoodOrderService foodOrderService;

  @KafkaListener(topics = "t.food.order")
  public void consumeMessage(String message) throws JsonProcessingException {
    log.info("message consumed {}", message);

    FoodOrderDto foodOrderDto = objectMapper.readValue(message, FoodOrderDto.class);
    foodOrderService.persistFoodOrder(foodOrderDto);
  }

  @KafkaListener(topics = "scheduled")
  public void consumeScheduledMessage(String message) {
    log.info("Consumed message: {}", message);
  }

}