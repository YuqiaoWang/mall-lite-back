package com.cmb.ccc.mallliteback.order.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cmb.ccc.common.domain.model.DomainEntity;

@Entity
@Table(name = "t_order")
public class Order extends DomainEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "order_sn", nullable = false)
    private String serialNumber;

    @Column(name = "order_status", nullable = false)
    private OrderStatus status;

    @Column(name = "consignee")
    private String consignee;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "address", nullable = false)
    private Address address;

    @Column(name = "goods_price", nullable = false)
    private Integer goodsPrice;

    @Column(name = "ship_sn")
    private String shipSerialNumber;

    @Column(name = "ship_channel")
    private String shipChannel;

    @Column(name = "ship_time")
    private Date shipTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "deleted")
    private Boolean deleted;

    public Order() {

    }

    public Order(Integer userId, String consignee, String mobile, Address address, Integer goodsPrice) {
        this.userId = userId;
        // this.serialNumber = ;
        this.status = OrderStatus.ESTABLISHED;
        this.consignee = consignee;
        this.mobile = mobile;
        this.address = address;
        this.goodsPrice = goodsPrice;
        this.addTime = new Date();
        this.deleted = false;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getShipSerialNumber() {
        return shipSerialNumber;
    }

    public void setShipSerialNumber(String shipSerialNumber) {
        this.shipSerialNumber = shipSerialNumber;
    }

    public String getShipChannel() {
        return shipChannel;
    }

    public void setShipChannel(String shipChannel) {
        this.shipChannel = shipChannel;
    }

    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

}
