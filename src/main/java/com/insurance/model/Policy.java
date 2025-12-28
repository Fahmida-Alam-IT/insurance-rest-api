package com.insurance.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "policies")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long policyId;

    @Column(nullable = false)
    private String policyNumber;

    @Column(nullable = false)
    private String policyType;

    @ManyToOne
    @JoinColumn(name = "customer_id")   // FK → matches customerId field in Customer
    private Customer customer;

    @OneToMany(mappedBy = "policy", cascade = CascadeType.ALL)
    private List<Claims> claims;
    


    // Getters & Setters
    public Long getPolicyId() { return policyId; }
    public void setPolicyId(Long policyId) { this.policyId = policyId; }

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

    public String getPolicyType() { return policyType; }
    public void setPolicyType(String policyType) { this.policyType = policyType; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public List<Claims> getClaims() { return claims; }
    public void setClaims(List<Claims> claims) { this.claims = claims; }
}

