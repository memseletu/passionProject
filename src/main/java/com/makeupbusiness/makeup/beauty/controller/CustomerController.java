package com.makeupbusiness.makeup.beauty.controller;

import com.makeupbusiness.makeup.beauty.model.Customer;
import com.makeupbusiness.makeup.beauty.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("customer/{customerId}")
    public Optional<Customer> getCustomerById(@PathVariable Long customerId) {
       return customerService.getCustomerById(customerId);
    }
    @GetMapping("/customer")
    public Iterable<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    @PostMapping("/customer")
    public void createCustomer( @RequestBody Customer customer){
        customerService.createCustomer( customer);
    }
    @PutMapping("/customer/{customerId}")
    public void updateCustomer(@RequestBody Customer customer){
        customerService.createCustomer( customer);
    }
    @DeleteMapping("/customer/{customerId}")
    public void deleteCustomerById(@PathVariable Long customerId){
        customerService.deleteCustomerById(customerId);
    }
}
