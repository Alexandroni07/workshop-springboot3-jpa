package com.projectspring.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.couse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
