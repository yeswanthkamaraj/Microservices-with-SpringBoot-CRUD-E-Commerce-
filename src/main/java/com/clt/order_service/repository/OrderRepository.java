package com.clt.order_service.repository;

import com.clt.order_service.entity.order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<order,Long> {
}
