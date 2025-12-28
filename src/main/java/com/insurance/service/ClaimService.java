package com.insurance.service;

import com.insurance.model.Claims;
import java.util.List;
import java.util.Optional;

public interface ClaimService {
    List<Claims> getAllClaims();
    Optional<Claims> getClaimById(Long claimId);
    Claims saveClaims(Claims claims);
    void deleteClaims(Long claimId);
	Claims createClaims(Claims claims);
	Claims updateClaims(Long id, Claims claim);	

}
