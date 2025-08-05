package com.dim.tsinjo.repository.interfaces;

import com.dim.tsinjo.model.Don;
import com.dim.tsinjo.repository.model.JDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DonRepository extends JpaRepository<JDon, UUID> {
}
