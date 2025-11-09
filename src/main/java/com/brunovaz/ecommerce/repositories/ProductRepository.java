package com.brunovaz.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunovaz.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
