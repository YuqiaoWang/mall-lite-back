package bupt.edu.mallliteback.order.domain.service;

import bupt.edu.mallliteback.order.domain.model.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}