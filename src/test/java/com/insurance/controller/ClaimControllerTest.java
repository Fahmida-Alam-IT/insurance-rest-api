package com.insurance.controller;

import com.insurance.model.Claims;
import com.insurance.service.ClaimService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ClaimController.class)
public class ClaimControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClaimService claimService;

    @Test
    void testGetClaimById() throws Exception {

        Claims claim = new Claims();
        claim.setClaimId(1L);
        claim.setPolicyNumber("POL123");
        claim.setClaimAmount(BigDecimal.valueOf(500));
        claim.setStatus("Approved");

        when(claimService.getClaimById(1L)).thenReturn(Optional.of(claim));

        mockMvc.perform(get("/claims/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.claimId").value(1L))
                .andExpect(jsonPath("$.policyNumber").value("POL123"))
                .andExpect(jsonPath("$.claimAmount").value(500))
                .andExpect(jsonPath("$.status").value("Approved"));
    }
}

