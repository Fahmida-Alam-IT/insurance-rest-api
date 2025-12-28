package com.insurance.service.imp;

import com.insurance.model.Claims;
import com.insurance.repository.ClaimRepository;
import com.insurance.service.ClaimService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService {

    private final ClaimRepository claimRepository;

    public ClaimServiceImpl(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    @Override
    public List<Claims> getAllClaims() {
        return claimRepository.findAll();
    }

    @Override
    public Optional<Claims> getClaimById(Long claimId) {
        return claimRepository.findById(claimId);
    }

    @Override
    public Claims saveClaims(Claims claims) {
        return claimRepository.save(claims);
    }

    @Override
    public void deleteClaims(Long claimId) {
        claimRepository.deleteById(claimId);
    }

	@Override
	public Claims createClaims(Claims claims) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Claims updateClaims(Long id, Claims updatedClaim) {
	    return claimRepository.findById(id)
	            .map(existing -> {
	                existing.setPolicyNumber(updatedClaim.getPolicyNumber());
	                existing.setClaimAmount(updatedClaim.getClaimAmount());
	                existing.setStatus(updatedClaim.getStatus());
	                return claimRepository.save(existing);
	            })
	            .orElse(null);
	}

}
