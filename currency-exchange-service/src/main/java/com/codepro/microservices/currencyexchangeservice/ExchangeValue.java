/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepro.microservices.currencyexchangeservice;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Francis
 */
@Entity
public class ExchangeValue {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name="currency_from")
    private String from;
    
    @Column(name="currency_to")
    private String to;
    
    private BigDecimal rate;
    private int port;

    public ExchangeValue() {
    }

    public ExchangeValue(Long id, String from, String to, BigDecimal rate) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    
    
    
    
}
