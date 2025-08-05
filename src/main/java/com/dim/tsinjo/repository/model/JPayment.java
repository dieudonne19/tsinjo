package com.dim.tsinjo.repository.model;

import com.dim.tsinjo.model.PaymentType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class JPayment {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String reference;

  private long amount;

  private PaymentType paymentType;

  private LocalDate paymentDate;
}
