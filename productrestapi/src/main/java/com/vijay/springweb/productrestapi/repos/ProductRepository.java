package com.vijay.springweb.productrestapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.springweb.productrestapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
