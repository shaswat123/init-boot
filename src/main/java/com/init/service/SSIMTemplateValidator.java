package com.init.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("ssimTemplateValidator")
public class SSIMTemplateValidator implements TemplateValidator {

    @Override
    public String validate() {
        return "SSIM Template validation!";
    }
}
