package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.insurance.model.Claims;

public interface ClaimRepository extends JpaRepository<Claims, Long> {}
