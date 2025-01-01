package com.enes.ecommerce.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toCustomer(CustomerRequest request) {
        if (request == null) return null;
        return new Customer(
                request.id(),
                request.firstName(),
                request.lastName(),
                request.email(),
                request.address()
        );
    }

    public CustomerResponse fromCustomer(Customer customer) {
            return new CustomerResponse(
                    customer.getId(),
                    customer.getFirstName(),
                    customer.getLastName(),
                    customer.getEmail(),
                    customer.getAddress()
            );
    }
}
