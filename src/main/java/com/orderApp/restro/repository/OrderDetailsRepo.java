package com.orderApp.restro.repository;

import com.orderApp.restro.models.OrderDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepo extends JpaRepository < OrderDetails,Integer>{
    
}
