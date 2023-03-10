package com.example.walmart.demo.controller;

import com.example.walmart.demo.Service.CustomerService;
import com.example.walmart.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getAllCustomer")
    public List<Customer> getCustomer() {
        return customerService.getCustomer();// "Sure Sreenu"
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        Customer customerRec = customerService.addCustomer(customer);
        return customerRec;
    }
}
