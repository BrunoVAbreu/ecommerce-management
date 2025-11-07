package com.brunovaz.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunovaz.ecommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
