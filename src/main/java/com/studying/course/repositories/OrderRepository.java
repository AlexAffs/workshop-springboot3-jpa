package com.studying.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studying.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
