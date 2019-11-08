package com.init.service;

import com.init.model.Vehicle;
import com.init.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("Car")
public class CarService implements AdapterService<Vehicle> {

    @Override
    public void process(Vehicle vehicle){

        System.out.println("Inside car service -"+vehicle.toString());

    }
}
