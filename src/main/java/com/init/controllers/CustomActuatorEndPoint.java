package com.init.controllers;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RestControllerEndpoint(id="customMetrics")
public class CustomActuatorEndPoint {

    @GetMapping("/custom")
    @ResponseBody
    public ResponseEntity customEndPoint(){
        return  new ResponseEntity<>("REST end point", HttpStatus.OK);
    }
}
