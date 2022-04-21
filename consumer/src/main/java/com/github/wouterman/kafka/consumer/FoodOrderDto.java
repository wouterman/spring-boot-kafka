package com.github.wouterman.kafka.consumer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FoodOrderDto {

  private String item;
  private Double amount;

}
