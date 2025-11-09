package com.brunovaz.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunovaz.ecommerce.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
