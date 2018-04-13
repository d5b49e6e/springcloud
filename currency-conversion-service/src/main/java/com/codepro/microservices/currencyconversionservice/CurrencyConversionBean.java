/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepro.microservices.currencyconversionservice;

import java.math.BigDecimal;

/**
 *
 * @author Francis
 */

public class CurrencyConversionBean {
    private Long id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal rate;
    private BigDecimal amount;
    private int port;
    

    public CurrencyConversionBean() {
    }

    public CurrencyConversionBean(Long id, String from, String to, BigDecimal quantity, BigDecimal rate, BigDecimal amount, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.rate = rate;
        this.amount = amount;
        this.port = port;
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    
}
