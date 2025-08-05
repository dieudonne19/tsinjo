package com.dim.tsinjo.repository.mapper;

import com.dim.tsinjo.model.Donor;
import com.dim.tsinjo.repository.model.JDonor;
import java.util.UUID;
import java.util.function.Function;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JDonorMapper implements Function<Donor, JDonor> {
  @Override
  public JDonor apply(Donor donor) {
    return new JDonor(UUID.randomUUID(), donor.getEmail(), donor.getFullname());
  }
}
