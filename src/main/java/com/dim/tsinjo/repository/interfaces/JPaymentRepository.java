package com.dim.tsinjo.repository.interfaces;

import com.dim.tsinjo.repository.model.JPayment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JPaymentRepository extends JpaRepository<JPayment, UUID> {
}
