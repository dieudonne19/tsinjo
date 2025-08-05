package com.dim.tsinjo.repository.interfaces;

import com.dim.tsinjo.repository.model.JHelp;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelpRepository extends JpaRepository<JHelp, UUID> {}
