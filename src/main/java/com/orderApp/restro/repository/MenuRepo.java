package com.orderApp.restro.repository;

import com.orderApp.restro.models.Menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository < Menu,Integer> {
    
}
