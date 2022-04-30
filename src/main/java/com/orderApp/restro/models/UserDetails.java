package com.orderApp.restro.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer uid;
    private String name;
    private Long phno;
    private Integer tid;
    private Double tamt;
    


    public UserDetails(Integer uid, String name, Long phno, Integer tid) {
        this.uid = uid;
        this.name = name;
        this.phno = phno;
        this.tid = tid;
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

    public Integer getTid() {
        return this.tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Double getTamt() {
        return this.tamt;
    }

    public void setTamt(Double tamt) {
        this.tamt = tamt;
    }
    

}