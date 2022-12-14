package com.makeupbusiness.makeup.beauty.controller;

import com.makeupbusiness.makeup.beauty.model.Product;
import com.makeupbusiness.makeup.beauty.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/{productId}")
    public Optional<Product> getProductById(@PathVariable Long productId){
        return productService.getProductById(productId);
    }

    @GetMapping("/product")
    public Iterable<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping("/product/{customerId}/product")
    public void createProduct(@PathVariable Long customerId,  @RequestBody Product product){
        productService.createProduct(customerId, product);
    }
    @PutMapping("/product/{customerID}/product")
    public void updateProduct(@PathVariable Long customerId, @RequestBody Product product){
        productService.createProduct(customerId, product);
    }
    @DeleteMapping("/product/{productId}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteProductById(id);
    }
}
