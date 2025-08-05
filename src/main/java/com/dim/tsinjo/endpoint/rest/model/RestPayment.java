package com.dim.tsinjo.endpoint.rest.model;

import com.dim.tsinjo.model.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestPayment {
    private String id;
    private Person payer;
    private RestPspPayment pspPayment;
    private LocalDateTime lastPspVerificationInstant;
    private int verificationAttemptNb;
    private LocalDate creationInstant;
}
