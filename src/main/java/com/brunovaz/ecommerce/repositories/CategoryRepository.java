package com.brunovaz.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunovaz.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
