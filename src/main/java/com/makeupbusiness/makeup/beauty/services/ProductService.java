package com.makeupbusiness.makeup.beauty.services;

import com.makeupbusiness.makeup.beauty.model.Customer;
import com.makeupbusiness.makeup.beauty.model.Product;
import com.makeupbusiness.makeup.beauty.repository.CustomerRepository;
import com.makeupbusiness.makeup.beauty.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerRepository customerRepository;

    public Optional<Product> getProductById(Long productId){
        return productRepository.findById(productId);
    }

    public Iterable<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void createProduct(Long customerId, Product product){
     Customer customer= (Customer) customerRepository.findById(customerId).orElse(null);
     productRepository.save(product);
    }


    public void deleteProductById(Long id){
      productRepository.deleteById(id);
    }

}
