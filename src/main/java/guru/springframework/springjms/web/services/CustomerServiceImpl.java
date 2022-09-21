package guru.springframework.springjms.web.services;

import guru.springframework.springjms.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .name("Customer Name").build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customer) {
        return CustomerDTO.builder().id(UUID.randomUUID()).name("Random Saved Name").build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customer) {
        CustomerDTO.builder().id(UUID.randomUUID()).name("Updated Customer").build();
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        CustomerDTO.builder().id(UUID.randomUUID()).name("Deleted User").build();
    }
}
