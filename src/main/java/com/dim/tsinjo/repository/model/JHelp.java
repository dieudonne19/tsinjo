package com.dim.tsinjo.repository.model;

import jakarta.persistence.*;
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
public class JHelp {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @OneToOne
  @JoinColumn(name = "help_beneficiary_id")
  private JBeneficiary helpBeneficiary;

  @OneToOne(optional = false)
  @JoinColumn(name = "payment_id")
  private JPayment payment;
}
