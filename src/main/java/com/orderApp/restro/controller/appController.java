package com.orderApp.restro.controller;

import java.util.List;

import com.orderApp.restro.models.Menu;
import com.orderApp.restro.models.OrderDetails;
import com.orderApp.restro.models.UserDetails;
import com.orderApp.restro.service.AppService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
    @Autowired
    private AppService appService;
    
    @GetMapping("/menu")
    public List<Menu> getmenu(){
        return appService.getMenu();
    }

    @PostMapping("/menu")
    public String addMenu(@RequestBody Menu menu){
        try {
            appService.addMenu(menu);
            return "succesfully added";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("/order/{tid}")
    public List<OrderDetails> getorder(@PathVariable Integer tid){
        return appService.getOrder(tid);
    }

    @PostMapping("/order/{tid}")
    public String addOrder(@PathVariable Integer tid,@RequestBody List<OrderDetails> orders){
        try {
            appService.addOrder(orders);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @PostMapping("/bill")
    public UserDetails getBill(@RequestBody UserDetails userDetails){
        return appService.getbill(userDetails);
    }
}
