package com.dim.tsinjo.repository.model;

import com.dim.tsinjo.model.Don;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class JDon extends Don {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "donor_id")
    private JDonor donor;

    @OneToOne(optional = false)
    @JoinColumn(name = "payment_id")
    private JPayment payment;
}
