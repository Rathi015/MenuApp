package com.orderApp.restro.service;

import java.util.ArrayList;
import java.util.List;

import com.orderApp.restro.models.Menu;
import com.orderApp.restro.models.OrderDetails;
import com.orderApp.restro.models.UserDetails;
import com.orderApp.restro.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Autowired
    private MenuRepo menuRepo;
    @Autowired
    private OrderDetailsRepo orderDetailsRepo;
    @Autowired
    private UserDetailsRepo userDetailsRepo;
    
    public List<Menu> getMenu(){
        return menuRepo.findAll();
    }

    public void addMenu(Menu menu){
        menuRepo.save(menu);
    }

    public List<OrderDetails> getOrder(Integer tid){
        List<OrderDetails> orders=new ArrayList<>();
        List<OrderDetails> allorders=orderDetailsRepo.findAll();
        allorders.forEach(order->{
            if(order.getTid()==tid){
                orders.add(order);
            }
        });
        return orders;
    }

    public void addOrder(List<OrderDetails> orders){
        orders.forEach(order->{
            order.setMenu(menuRepo.findById(order.getMno()).get());
            orderDetailsRepo.save(order);
        });
    }

    public UserDetails getbill(UserDetails userDetails){
        userDetails.setTamt(0.0);
        List<OrderDetails> orders=getOrder(userDetails.getTid());
        orders.forEach(order->{
            userDetails.setTamt(userDetails.getTamt()+order.getMenu().getPrice());
            orderDetailsRepo.deleteById(order.getOno());
        });

        userDetailsRepo.save(userDetails);
        return userDetails;
    }
}
