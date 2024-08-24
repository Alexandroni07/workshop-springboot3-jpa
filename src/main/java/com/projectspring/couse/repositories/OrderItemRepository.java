package com.projectspring.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.couse.entities.OrderItem;
import com.projectspring.couse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
