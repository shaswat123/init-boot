package com.init.controllers;

import com.init.config.InitConfigurationProp;
import com.init.service.TemplateValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/init")
public class InitController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private InitConfigurationProp initConfigurationProp;




    //@Qualifier("ssmTemplateValidator")
    //private TemplateValidator ssimTemplateValidator;//autowired by name


    private TemplateValidator validator;

    //Setter based injection

    /*@Autowired
    public void setSsimTemplateValidator(@Qualifier("ssmTemplateValidator") TemplateValidator validator) {
        this.validator = validator;
    }*/

    //Construstor injection


   /* @Autowired
    public InitController(@Qualifier("ssimTemplateValidator") TemplateValidator validator) {
        this.validator = validator;
    }*/

    @Autowired(required=false) //doesn't have any impact on constructor based autowiring ,
    // because constructor based autowiring are mandatory dependencies ,the deployment will still fail if the spring doesn't find
    //the bean during the creation phase .This is different in case of setter based .If we mark autowired =false ,the deployment will suceed but when accessed it will throw NPE
    public InitController(@Qualifier("ssimTemplateValidator") TemplateValidator validator) {
        this.validator = validator;
    }


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

    @GetMapping("/validate")
    public ResponseEntity<String> validate(){

        return new ResponseEntity<>(validator.validate(), HttpStatus.OK);

    }



}
