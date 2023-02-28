package com.example.walmart.demo.Service;

import com.example.walmart.demo.model.Customer;
import com.example.walmart.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer) {
        Customer customerRec = customerRepository.save(customer);
        return customerRec;
    }
}
