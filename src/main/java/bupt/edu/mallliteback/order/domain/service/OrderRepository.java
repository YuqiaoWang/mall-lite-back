package bupt.edu.mallliteback.order.domain.service;

import java.util.List;

import bupt.edu.mallliteback.order.domain.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByUserId(Integer userId);
}