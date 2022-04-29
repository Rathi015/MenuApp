package com.orderApp.restro.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
    @Id
    private Integer sno;
    private String item;
    private Double price;

    public Menu(Integer sno, String item, Double price) {
        this.sno = sno;
        this.item = item;
        this.price = price;
    }

    public Menu() {
    }

    public Integer getSno() {
        return this.sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
}
