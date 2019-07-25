package com.cmb.ccc.mallliteback.order.domain.service;

import java.util.Date;
import java.util.List;

import com.cmb.ccc.mallliteback.order.domain.model.Address;
import com.cmb.ccc.mallliteback.order.domain.model.Order;
import com.cmb.ccc.mallliteback.order.domain.model.OrderStatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private OrderRepository orderRepository;

    public void generateOrder(Integer userId, String consignee, String mobile, Address address, Integer goodsPrice) {
        try {
            Order newOrder = new Order(userId, consignee, mobile, address, goodsPrice);
            orderRepository.save(newOrder);
        } catch (Exception e) {
            logger.info("exception : " + e.getMessage());
        }

    }

    public Order queryById(Integer id) {
        return orderRepository.getOne(id);
    }

    public List<Order> queryByUserId(Integer userId) {
        return orderRepository.findByUserId(userId);
    }
}