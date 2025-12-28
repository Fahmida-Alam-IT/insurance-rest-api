package com.insurance.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Claims")
public class Claims {
		

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "claim_id")
    private Long claimId;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "claim_amount")
    private BigDecimal claimAmount;

    @Column(name = "status")
    private String status;
    
    
	@ManyToOne
	@JoinColumn(name = "policy_id")
	private Policy policy;

    // Getters and setters
    public Long getClaimId() {
        return claimId;
    }

    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(BigDecimal claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}




