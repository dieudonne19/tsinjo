package com.dim.tsinjo.mapper;

import com.dim.tsinjo.model.Donor;
import com.dim.tsinjo.repository.model.JDonor;
import java.util.function.Function;
import org.springframework.stereotype.Component;

@Component
public class DonorMapper implements Function<JDonor, Donor> {
  @Override
  public Donor apply(JDonor jDonor) {
    return new Donor(jDonor.getEmail(), jDonor.getFullname());
  }
}
