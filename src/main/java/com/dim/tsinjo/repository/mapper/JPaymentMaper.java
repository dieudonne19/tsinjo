package com.dim.tsinjo.repository.mapper;

import com.dim.tsinjo.model.Payment;
import com.dim.tsinjo.repository.model.JPayment;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.function.Function;

@Component
public class JPaymentMaper implements Function<Payment, JPayment> {
    @Override
    public JPayment apply(Payment payment) {
        return new JPayment(UUID.randomUUID(), payment.getReference(), payment.getAmount(), payment.getPaymentType(), payment.getPaymentDate());
    }
}
