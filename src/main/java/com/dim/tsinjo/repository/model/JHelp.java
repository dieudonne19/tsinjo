package com.dim.tsinjo.repository.model;

import com.dim.tsinjo.model.Beneficiary;
import com.dim.tsinjo.model.Payment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

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
