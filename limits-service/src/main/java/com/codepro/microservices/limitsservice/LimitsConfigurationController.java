/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepro.microservices.limitsservice;

import com.codepro.microservices.limitsservice.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Francis
 */
@RestController
public class LimitsConfigurationController {
    
    
    @Autowired
    private Configuration conf;
    
    
    @GetMapping("/limits")
    public LimitsConfiguration getConfig()
    {
        return new LimitsConfiguration(conf.getMin(),conf.getMax());
    }
}
