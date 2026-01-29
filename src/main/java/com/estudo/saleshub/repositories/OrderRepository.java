package com.estudo.saleshub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.saleshub.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
