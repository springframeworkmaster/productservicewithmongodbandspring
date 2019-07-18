package com.tasks.app.productservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tasks.app.productservice.domain.Product;


public interface ProductRepository extends CrudRepository<Product, String> {
}
