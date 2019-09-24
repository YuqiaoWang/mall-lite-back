package bupt.edu.mallliteback.order.domain.model;

import java.util.Date;

public class UIOrder {

    private Integer userId;

    private String serialNumber;

    private OrderStatus status;

    private String consignee;

    private String mobile;

    private String addressDetail;

    private Integer goodsPrice;

    private String shipSerialNumber;

    private String shipChannel;

    private Date shipTime;

    private Date endTime;

    private Date addTime;

    private Date updateTime;

    public UIOrder() {

    }

    public UIOrder(Order order) {
        this.userId = order.getUserId();
        this.serialNumber = order.getSerialNumber();
        this.status = order.getStatus();
        this.consignee = order.getConsignee();
        this.mobile = order.getMobile();
        this.addressDetail = order.getAddress();
        this.goodsPrice = order.getGoodsPrice();
        this.shipSerialNumber = order.getShipSerialNumber();
        this.shipChannel = order.getShipChannel();
        this.shipTime = order.getShipTime();
        this.endTime = order.getEndTime();
        this.addTime = order.getAddTime();
        this.updateTime = order.getUpdateTime();
    }
}