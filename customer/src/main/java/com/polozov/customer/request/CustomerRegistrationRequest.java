package com.polozov.customer.request;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email){
}
