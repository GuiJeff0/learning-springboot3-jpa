package com.learningweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningweb.webservices.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
