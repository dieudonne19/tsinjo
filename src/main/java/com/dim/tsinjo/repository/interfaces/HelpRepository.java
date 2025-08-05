package com.dim.tsinjo.repository.interfaces;

import com.dim.tsinjo.model.Help;
import com.dim.tsinjo.repository.model.JHelp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HelpRepository extends JpaRepository<JHelp, UUID> {

}
