package guru.springframework.springjms.web.services;

import guru.springframework.springjms.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveNewCustomer(CustomerDTO customer);

    void updateCustomer(UUID customerId, CustomerDTO customer);

    void deleteCustomer(UUID customerId);
}
