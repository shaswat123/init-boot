package com.init.controllers;

import com.init.config.InitConfigurationProp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/init")
public class InitController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private InitConfigurationProp initConfigurationProp;

    @GetMapping
    public String list(){

        return "Init";

    }

    @GetMapping("/list")
    public String getInit() throws Exception{

        if(initConfigurationProp.getPort()!=0){
            throw new Exception();

        }

        return initConfigurationProp.getHost();

    }



}