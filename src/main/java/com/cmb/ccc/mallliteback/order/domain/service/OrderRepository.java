package com.cmb.ccc.mallliteback.order.domain.service;

import java.util.List;

import com.cmb.ccc.mallliteback.order.domain.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByUserId(Integer userId);
}