package com.makeupbusiness.makeup.beauty.repository;

import com.makeupbusiness.makeup.beauty.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
