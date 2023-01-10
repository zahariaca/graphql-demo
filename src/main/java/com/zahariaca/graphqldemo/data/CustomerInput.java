package com.zahariaca.graphqldemo.data;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInput {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    public Customer getCustomerEntity() {
        return Customer.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .phone(phone)
                .address(address)
                .city(city)
                .state(state)
                .zipCode(zipCode)
                .build();
    }
}
