package com.brunovaz.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunovaz.ecommerce.entities.Category;
import com.brunovaz.ecommerce.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long Id){
        Optional<Category> obj = categoryRepository.findById(Id);
        return obj.get();
    }
}
