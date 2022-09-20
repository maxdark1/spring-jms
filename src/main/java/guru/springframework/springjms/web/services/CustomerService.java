package guru.springframework.springjms.web.services;

import guru.springframework.springjms.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);
}
