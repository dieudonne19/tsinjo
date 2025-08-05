package com.dim.tsinjo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Help {
  private Beneficiary helpBeneficiary;
  private Payment helpPayment;
}
