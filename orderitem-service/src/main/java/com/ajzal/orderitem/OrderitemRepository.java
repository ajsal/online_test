package com.ajzal.orderitem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.ajzal.orderitem.model.Orderitem;

/**
 * @author ajzal
 */
public interface OrderitemRepository extends JpaRepository<Orderitem, Long> {
	//List<Orderitem> findByOrderid(Long id);
	
	List<Orderitem> findByOrderid(long orderId);
	//@Query("SELECT o FROM Orderitem o WHERE o.orderId = :orderId")
	//List<Orderitem> find(@Param("order") Long orderId);
}
