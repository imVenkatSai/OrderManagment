package com.enterprise.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
