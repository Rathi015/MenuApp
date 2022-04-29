package com.orderApp.restro.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderDetails{
    @Id
    private Integer ono;
    private Integer mno;
    private Integer tid;


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

}