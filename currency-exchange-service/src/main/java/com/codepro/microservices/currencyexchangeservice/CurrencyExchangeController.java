/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepro.microservices.currencyexchangeservice;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Francis
 */
@RestController
public class CurrencyExchangeController {
            
    @Autowired
    private Configuration conf;
    
    @Autowired
    private Environment env;
    
    @Autowired
    private ExchangeValueRepository exchangeRepo;
    
    @GetMapping("/ping")
    public String ping(){
        Date date = new Date();        
        return String.format("ping %s",date.toString());
    }
    
    @GetMapping("/limits")
    public Configuration getLimits()
    {
        return conf;
    }
    
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue conversion(
            @PathVariable String from
            ,@PathVariable String to
    ){
     
        
        ExchangeValue obj = exchangeRepo.findByFromAndTo(from, to);
//        ExchangeValue obj = new ExchangeValue(1000l,from,to,new BigDecimal("65"));
        
        obj.setPort(Integer.parseInt(env.getProperty("local.server.port")));
        return obj;
    }
}
