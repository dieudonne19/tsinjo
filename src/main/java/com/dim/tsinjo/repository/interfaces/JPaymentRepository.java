package com.dim.tsinjo.repository.interfaces;

import com.dim.tsinjo.repository.model.JPayment;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPaymentRepository extends JpaRepository<JPayment, UUID> {}
