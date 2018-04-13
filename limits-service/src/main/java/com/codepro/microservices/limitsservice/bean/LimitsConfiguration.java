/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepro.microservices.limitsservice.bean;

/**
 *
 * @author Francis
 */
public class LimitsConfiguration {
    private int min;
    private int max;

    public LimitsConfiguration(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
    
    
    
}
