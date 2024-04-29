package com.Rafael.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rafael.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
