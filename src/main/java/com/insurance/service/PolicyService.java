package com.insurance.service;

import com.insurance.model.Policy;
import java.util.List;
import java.util.Optional;

public interface PolicyService {
    List<Policy> getAllPolicies();
    Optional<Policy> getPolicyById(Long policyId);
    Policy savePolicy(Policy policy);
    void deletePolicy(Long policyId);
}


