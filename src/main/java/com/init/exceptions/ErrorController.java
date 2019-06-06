package com.init.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    private static final String PATH="/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Page not found!!";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
