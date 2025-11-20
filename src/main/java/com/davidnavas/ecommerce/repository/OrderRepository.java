package com.davidnavas.ecommerce.repository;

import com.davidnavas.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByUserUsername(String username);

    Optional<Order> findbyIdAndUserUsername(Long id, String username);
}