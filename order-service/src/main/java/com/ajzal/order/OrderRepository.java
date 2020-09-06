package com.ajzal.order;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ajzal.order.model.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {}
