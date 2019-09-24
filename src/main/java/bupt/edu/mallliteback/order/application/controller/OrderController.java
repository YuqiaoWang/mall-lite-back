package bupt.edu.mallliteback.order.application.controller;

import bupt.edu.mallliteback.order.application.service.OrderAppService;
import bupt.edu.mallliteback.order.domain.model.Address;
import bupt.edu.mallliteback.order.domain.model.Order;
import bupt.edu.mallliteback.order.domain.model.UIOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    private OrderAppService appService;

    // TODO: 需要修改返回值，以及考虑入参
    @RequestMapping(value = "generate")
    public void generateOrder(@Param(value = "userId") Integer userId, @Param(value = "consignee") String consignee,
            @Param(value = "mobile") String mobile, @Param(value = "address") Address address,
            @Param(value = "goodsPrice") Integer goodsPrice) {
        appService.generateOrder(userId, consignee, mobile, address, goodsPrice);
    }

    // TODO: 需要修改返回值，以及修改为返回UI类
    @RequestMapping(value = "query")
    public UIOrder showOrder(@Param(value = "id") Integer orderId) {
        return appService.getCurrentOrder(orderId);
    }
}