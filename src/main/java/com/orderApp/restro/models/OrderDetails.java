package com.orderApp.restro.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ono;
    private Integer mno;
    private Integer tid;
    @OneToOne
    private Menu menu;


    public OrderDetails(Integer ono, Integer mno, Integer tid) {
        this.ono = ono;
        this.mno = mno;
        this.tid = tid;
    }

    public OrderDetails() {
    }


    public Integer getOno() {
        return this.ono;
    }

    public void setOno(Integer ono) {
        this.ono = ono;
    }

    public Integer getMno() {
        return this.mno;
    }

    public void setMno(Integer mno) {
        this.mno = mno;
    }

    public Integer getTid() {
        return this.tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}    