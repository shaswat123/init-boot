package com.init.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("ssmTemplateValidator")
public class SSMTemplateValidator implements TemplateValidator {

    @Override
    public String validate() {
        return "SSM Template validation!";
    }
}
