package com.dim.tsinjo.repository;

import com.dim.tsinjo.endpoint.rest.model.RestPayment;
import com.dim.tsinjo.mapper.PaymentMapper;
import com.dim.tsinjo.model.Payment;
import com.dim.tsinjo.model.PaymentType;
import com.dim.tsinjo.model.Person;
import com.dim.tsinjo.repository.interfaces.JPaymentRepository;
import com.dim.tsinjo.repository.model.JPayment;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
@AllArgsConstructor
public class PaymentRepository {
    private final JPaymentRepository jPaymentRepository;
    private final RestTemplate restTemplate = new RestTemplate();
    private final String VOLA_URL = "https://42cwka3n4ifcp7ufheyrpmph240iuaxo.lambda-url.eu-west-3.on.aws/";
    private final String apiKey = System.getenv("apiKey");
    private PaymentMapper paymentMapper;

    public ResponseEntity<Payment> createPayment(Person payer, JPayment payment) {
        String url = VOLA_URL +
                "/payment" +
                "?apiKey=" + this.apiKey +
                "&payerEmail=" + payer.getEmail() +
                "&pspType=" + payment.getPaymentType() +
                "&pspPaymentId=" + payment.getReference();
        ResponseEntity<RestPayment> response = restTemplate.postForEntity(url, new Payment(), RestPayment.class);
        if (response.getBody() != null) {
            JPayment savedJPayment = jPaymentRepository.save(payment);
            Payment savedPayment = new Payment(
                    savedJPayment.getReference(),
                    savedJPayment.getAmount(),
                    savedJPayment.getPaymentType(),
                    savedJPayment.getPaymentDate());

            return ResponseEntity.status(202).body(savedPayment);
        }
        return ResponseEntity.ok(paymentMapper.apply(response.getBody()));
    }


    public ResponseEntity<Payment> verifyPayment(Person payer, JPayment payment) {
        String url = VOLA_URL +
                "/payment" +
                "?apiKey=" + this.apiKey +
                "&payerEmail=" + payer.getEmail() +
                "&pspType=" + payment.getPaymentType() +
                "&pspPaymentId=" + payment.getReference();
        ResponseEntity<RestPayment> response = restTemplate.getForEntity(url, RestPayment.class);

        assert response.getBody() != null;
        return ResponseEntity.ok(paymentMapper.apply(response.getBody()));
    }
}
