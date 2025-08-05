package com.dim.tsinjo.repository.mapper;

import com.dim.tsinjo.model.Don;
import com.dim.tsinjo.model.Donor;
import com.dim.tsinjo.repository.model.JDon;
import com.dim.tsinjo.repository.model.JDonor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.function.Function;

@Component
@AllArgsConstructor
public class JDonorMapper implements Function<Donor, JDonor> {
    @Override
    public JDonor apply(Donor donor) {
        return new JDonor(UUID.randomUUID(), donor.getEmail(), donor.getFullname());
    }
}
