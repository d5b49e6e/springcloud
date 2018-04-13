/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepro.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Francis
 */

@RestController
public class CurrencyConversionController {
    
    @Autowired
    private CurrencyExchangeServiceProxy proxy;

    @GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convert(
                @PathVariable String from
            ,   @PathVariable String to
            ,   @PathVariable BigDecimal quantity    
    ){
        String uri = "http://localhost:8000/from/{from}/to/{to}";
        Map<String,String> uriVar = new HashMap();
        uriVar.put("from",from);
        uriVar.put("to",to);
        
        
        ResponseEntity<CurrencyConversionBean> res = new RestTemplate().getForEntity(uri
                ,CurrencyConversionBean.class
                ,uriVar
        );
        
        CurrencyConversionBean bean = res.getBody();
        
        bean.setQuantity(quantity);
        bean.setAmount(bean.getRate().multiply(quantity));
        
        return bean;        
    }
    
     @GetMapping("currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertFeign(
                @PathVariable String from
            ,   @PathVariable String to
            ,   @PathVariable BigDecimal quantity    
    ){
        
        CurrencyConversionBean bean = proxy.conversion(from, to);
        
        bean.setQuantity(quantity);
        bean.setAmount(bean.getRate().multiply(quantity));
        
        return bean;        
    }
}
