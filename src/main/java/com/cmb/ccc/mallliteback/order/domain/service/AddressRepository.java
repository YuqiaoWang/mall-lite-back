package com.cmb.ccc.mallliteback.order.domain.service;

import com.cmb.ccc.mallliteback.order.domain.model.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}