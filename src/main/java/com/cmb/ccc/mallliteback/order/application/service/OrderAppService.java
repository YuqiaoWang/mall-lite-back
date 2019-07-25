package com.cmb.ccc.mallliteback.order.application.service;

import com.cmb.ccc.mallliteback.order.domain.model.Address;
import com.cmb.ccc.mallliteback.order.domain.model.Order;
import com.cmb.ccc.mallliteback.order.domain.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderAppService {
    @Autowired
    private OrderService service;

    @Transactional
    public void generateOrder(Integer userId, String consignee, String mobile, Address address, Integer goodsPrice) {
        service.generateOrder(userId, consignee, mobile, address, goodsPrice);
    }

    @Transactional
    public Order getCurrentOrder(Integer orderId) {
        return service.queryById(orderId);
    }

}