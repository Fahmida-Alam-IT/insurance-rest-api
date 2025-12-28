package com.insurance.controller;

import com.insurance.model.Claims;
import com.insurance.service.ClaimService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/claims")
public class ClaimController {

    private final ClaimService claimService;

    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @PostMapping
    public Claims createClaim(@RequestBody Claims claim) {
        return claimService.createClaims(claim);
    }

    @GetMapping("/{id}")
    public Optional<Claims> getClaimById(@PathVariable Long id) {
        return claimService.getClaimById(id);
    }

    @GetMapping
    public List<Claims> getAllClaims() {
        return claimService.getAllClaims();
    }

    @PutMapping("/{id}")
    public Claims updateClaim(@PathVariable Long id, @RequestBody Claims claims) {
        return claimService.updateClaims(id, claims);
    }

    @DeleteMapping("/{id}")
    public void deleteClaim(@PathVariable Long id) {
        claimService.deleteClaims(id);
    }
}
