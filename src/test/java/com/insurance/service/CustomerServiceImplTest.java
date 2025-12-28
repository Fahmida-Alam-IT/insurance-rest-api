package com.insurance.service;

import com.insurance.model.Customer;
import com.insurance.repository.CustomerRepository;
import com.insurance.service.imp.CustomerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class CustomerServiceImplTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerServiceImpl customerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetCustomerById() {
        Customer customer = new Customer();
        customer.setCustomerId(1L);
        customer.setFirstName("John");

        when(customerRepository.findById(1L))
                .thenReturn(Optional.of(customer));

        Optional<Customer> result = customerService.getCustomerById(1L);

        assertEquals(true, result.isPresent());
        assertEquals("John", result.get().getFirstName());
    }

    @Test
    void testSaveCustomer() {
        Customer customer = new Customer();
        customer.setCustomerId(2L);
        customer.setFirstName("Alice");

        when(customerRepository.save(customer)).thenReturn(customer);

        Customer saved = customerService.saveCustomer(customer);

        assertEquals(2L, saved.getCustomerId());
        assertEquals("Alice", saved.getFirstName());
    }
}
