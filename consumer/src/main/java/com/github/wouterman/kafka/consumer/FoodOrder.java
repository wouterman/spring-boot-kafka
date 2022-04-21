package com.github.wouterman.kafka.consumer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FoodOrder {

  @Id
  @GeneratedValue
  private Long id;
  private String item;
  private Double amount;
}
