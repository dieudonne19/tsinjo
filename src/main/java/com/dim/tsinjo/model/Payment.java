package com.dim.tsinjo.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment {
  private String reference;
  private long amount;
  private PaymentType paymentType;
  private LocalDate paymentDate;
}
