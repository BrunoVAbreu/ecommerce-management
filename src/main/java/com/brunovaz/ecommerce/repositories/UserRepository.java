package com.brunovaz.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunovaz.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
