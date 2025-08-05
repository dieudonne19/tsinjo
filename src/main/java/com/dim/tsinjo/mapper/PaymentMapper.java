package com.dim.tsinjo.mapper;

import com.dim.tsinjo.endpoint.rest.model.RestPayment;
import com.dim.tsinjo.model.Payment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PaymentMapper implements Function<RestPayment, Payment> {
    @Override

    public Payment apply(RestPayment restPayment) {
        var payment = new Payment();
        payment.setPaymentType(restPayment.getPspPayment().getType());
        payment.setAmount(restPayment.getPspPayment().getAmount());
        payment.setPaymentDate(restPayment.getCreationInstant());
        return payment;
    }

}
