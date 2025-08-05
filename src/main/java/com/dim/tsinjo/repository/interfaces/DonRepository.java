package com.dim.tsinjo.repository.interfaces;

import com.dim.tsinjo.repository.model.JDon;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonRepository extends JpaRepository<JDon, UUID> {}
