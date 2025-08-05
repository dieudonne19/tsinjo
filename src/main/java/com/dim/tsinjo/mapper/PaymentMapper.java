package com.dim.tsinjo.mapper;

import com.dim.tsinjo.endpoint.rest.model.RestPayment;
import com.dim.tsinjo.model.Payment;
import java.util.function.Function;
import org.springframework.stereotype.Component;

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
