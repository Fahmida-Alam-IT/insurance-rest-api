
 package com.insurance.service;

import com.insurance.model.Customer;
import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(Long customerId); // updated parameter name
    Customer saveCustomer(Customer customer);
    void deleteCustomer(Long customerId); // updated parameter name
}
