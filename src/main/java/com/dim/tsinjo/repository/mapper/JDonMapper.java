package com.dim.tsinjo.repository.mapper;

import com.dim.tsinjo.model.Don;
import com.dim.tsinjo.model.Payment;
import com.dim.tsinjo.repository.model.JDon;
import com.dim.tsinjo.repository.model.JPayment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.function.Function;

@Component
@AllArgsConstructor
public class JDonMapper implements Function<Don, JDon> {
    private final JDonorMapper jDonorMapper;
    private final JPaymentMaper jPaymentMaper;
    @Override
    public JDon apply(Don don) {
        return new JDon(UUID.randomUUID().toString(), jDonorMapper.apply(don.getDonor()), jPaymentMaper.apply(don.getDonPayment()));
    }
}
