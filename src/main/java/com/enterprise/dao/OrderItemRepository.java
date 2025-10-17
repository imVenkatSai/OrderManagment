package com.enterprise.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
