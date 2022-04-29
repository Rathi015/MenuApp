package com.orderApp.restro.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails{
    @Id
    private Integer uid;
    private String name;
    private Long phno;
    

    public UserDetails(Integer uid, String name, Long phno) {
        this.uid = uid;
        this.name = name;
        this.phno = phno;
    }

    public UserDetails() {
    }

    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhno() {
        return this.phno;
    }

    public void setPhno(Long phno) {
        this.phno = phno;
    }

}