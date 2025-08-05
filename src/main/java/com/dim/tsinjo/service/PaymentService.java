package com.dim.tsinjo.service;

import com.dim.tsinjo.mapper.PaymentMapper;
import com.dim.tsinjo.model.Payment;
import com.dim.tsinjo.model.Person;
import com.dim.tsinjo.repository.PaymentRepository;
import com.dim.tsinjo.repository.model.JPayment;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class PaymentService {
  private PaymentRepository paymentRepository;
  private PaymentMapper paymentMapper;

  @SneakyThrows
  public Payment verifyPayment(Person person, JPayment payment) {
    ResponseEntity<Payment> paymentToVerify = this.paymentRepository.verifyPayment(person, payment);
    // log todo
    if (paymentToVerify.getBody() == null) {
      System.out.println("Payment not verified");
    }
    return paymentToVerify.getBody();
  }

  @SneakyThrows
  public Payment createPayment(Person person, JPayment payment) {
    ResponseEntity<Payment> createdPayment = this.paymentRepository.createPayment(person, payment);
    // log todo
    if (createdPayment.getBody() == null) {
      System.out.println("Payment not created");
    }
    return createdPayment.getBody();
  }
}
