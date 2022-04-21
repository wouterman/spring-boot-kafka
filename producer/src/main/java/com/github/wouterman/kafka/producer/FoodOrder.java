package com.github.wouterman.kafka.producer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FoodOrder {
  private String item;
  private Double amount;
}