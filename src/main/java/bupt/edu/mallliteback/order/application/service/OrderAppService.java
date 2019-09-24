package bupt.edu.mallliteback.order.application.service;

import bupt.edu.mallliteback.order.domain.model.Address;
import bupt.edu.mallliteback.order.domain.model.Order;
import bupt.edu.mallliteback.order.domain.model.UIOrder;
import bupt.edu.mallliteback.order.domain.service.OrderService;

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
    public UIOrder getCurrentOrder(Integer orderId) {
        Order order = service.queryById(orderId);
        UIOrder uiOrder = new UIOrder(order);
        return uiOrder;
    }

}