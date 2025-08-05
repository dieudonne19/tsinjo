package com.dim.tsinjo.service;

import com.dim.tsinjo.model.Don;
import com.dim.tsinjo.repository.PaymentRepository;
import com.dim.tsinjo.repository.interfaces.DonRepository;
import com.dim.tsinjo.repository.interfaces.JPaymentRepository;
import com.dim.tsinjo.repository.model.JDon;
import com.dim.tsinjo.repository.model.JPayment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class DonService {
    private final DonRepository donRepository;
    private final PaymentRepository paymentRepository;


    public JDon createDon(JDon donToCreate) {
        JPayment createdPaymentRelatedToDon = paymentRepository.createPayment(donToCreate.getDonor(), donToCreate.getDonPayment());
        var createdDon = donRepository.save(donToCreate);
        return createdDon;
    }

    public List<JDon> getDons() {
        var dons = donRepository.findAll();
        return dons;
    }
}
