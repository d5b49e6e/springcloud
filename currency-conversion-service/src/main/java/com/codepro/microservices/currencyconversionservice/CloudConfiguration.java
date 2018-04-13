/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepro.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Francis
 */
@Configuration
//@EnableFeignClients
@EnableFeignClients("com.codepro.microservices.currencyconversionservice")
public class CloudConfiguration {

}
