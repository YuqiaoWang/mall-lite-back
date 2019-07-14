package com.cmb.ccc.mallliteback.order.domain.model;

public enum OrderStatus {

    ESTABLISHED(0, "已创建"), PAYED(1, "已付款"), DELIVERING(2, "发货中"), RECEIVED(3, "已收货"), FINISHED(4, "已完成"),
    CANCELED(5, "已取消");

    private Integer statusNum;
    private String description;

    private OrderStatus(Integer statusNum, String description) {
        this.statusNum = statusNum;
        this.description = description;
    }

}