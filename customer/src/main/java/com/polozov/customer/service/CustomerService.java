package com.polozov.customer.service;

import com.polozov.customer.entity.Customer;
import com.polozov.customer.repository.CustomerRepository;
import com.polozov.customer.request.CustomerRegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // TODO: 21.02.2022 check if email valid
        // TODO: 21.02.2022 check if email not taken
        customerRepository.save(customer);
    }
}
