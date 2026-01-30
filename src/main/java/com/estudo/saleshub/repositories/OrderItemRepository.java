package com.estudo.saleshub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.saleshub.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
