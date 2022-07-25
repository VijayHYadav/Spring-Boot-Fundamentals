package com.vijay.springweb.productrestapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.springweb.productrestapi.entities.Product;
import com.vijay.springweb.productrestapi.repos.ProductRepository;

@RestController
public class ProductRestController {
    
    @Autowired
    ProductRepository repository;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getProducts () {
        return repository.findAll();
    }
}
