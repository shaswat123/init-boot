package com.init.controllers;

import com.init.model.Vehicle;
import com.init.registry.ServiceLocatorRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.spi.ServiceRegistry;

@RestController
@RequestMapping("/vehicle")
public class VehicleServiceController {

    @Autowired
    private ServiceLocatorRegistry serviceLocatorRegistry;

    @PostMapping
    public void processVehicleDetails(@RequestBody Vehicle vehicle){

        serviceLocatorRegistry.getService(vehicle.getVehicleType()).process(vehicle);

        System.out.println(vehicle.getVehicleName());

    }
}
