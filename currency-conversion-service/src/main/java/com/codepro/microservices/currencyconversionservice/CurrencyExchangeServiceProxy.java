/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepro.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Francis
 */
//@FeignClient(name="currency-exchange-service",url="localhost:8000")
@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
    
    
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean conversion(
            @PathVariable("from") String from
            ,@PathVariable("to") String to
    );
    
    
}
