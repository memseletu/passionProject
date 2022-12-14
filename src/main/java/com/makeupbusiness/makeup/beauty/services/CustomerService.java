package com.makeupbusiness.makeup.beauty.services;

import com.makeupbusiness.makeup.beauty.model.Customer;
import com.makeupbusiness.makeup.beauty.model.Product;
import com.makeupbusiness.makeup.beauty.repository.CustomerRepository;
import com.makeupbusiness.makeup.beauty.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;



    public Optional<Customer> getCustomerById(Long customerId){
        return customerRepository.findById(customerId);
    }

    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public void createCustomer(Customer customer){
       customerRepository.save(customer);
    }
    public void updateCustomer(Long id, Customer customer){
        customerRepository.save(customer);
    }

    public void deleteCustomerById(Long id){
        customerRepository.deleteById(id);
    }

}
