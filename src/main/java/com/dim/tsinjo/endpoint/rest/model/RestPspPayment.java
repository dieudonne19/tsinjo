package com.dim.tsinjo.endpoint.rest.model;

import com.dim.tsinjo.model.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestPspPayment {
    private String id;
    private PaymentType type;
    private long amount;
    private Instant creationInstant;
}
