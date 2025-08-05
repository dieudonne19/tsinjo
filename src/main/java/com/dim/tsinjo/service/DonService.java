package com.dim.tsinjo.service;

import com.dim.tsinjo.mapper.DonorMapper;
import com.dim.tsinjo.repository.PaymentRepository;
import com.dim.tsinjo.repository.interfaces.DonRepository;
import com.dim.tsinjo.repository.model.JDon;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class DonService {
  private final DonRepository donRepository;
  private final PaymentRepository paymentRepository;
  private final DonorMapper donorMapper;

  public JDon createDon(JDon donToCreate) {
    var createdPayment =
        paymentRepository.createPayment(
            donorMapper.apply(donToCreate.getDonor()), donToCreate.getPayment());
    if (createdPayment.getBody() == null) {
      // log todo
    }
    return donRepository.save(donToCreate);
  }

  public List<JDon> getDons() {
    return donRepository.findAll();
  }
}
