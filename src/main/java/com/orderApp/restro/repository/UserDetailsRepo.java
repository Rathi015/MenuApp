package com.orderApp.restro.repository;

import com.orderApp.restro.models.UserDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends JpaRepository < UserDetails,Integer> {
    
}
