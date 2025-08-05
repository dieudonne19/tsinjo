package com.dim.tsinjo.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Donor extends Person {
  private String email;
  private String fullname;
}
