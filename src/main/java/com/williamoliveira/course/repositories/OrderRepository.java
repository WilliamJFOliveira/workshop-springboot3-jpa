package com.williamoliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamoliveira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
