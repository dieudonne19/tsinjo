package com.dim.tsinjo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

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
