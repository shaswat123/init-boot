package com.init.service;

import com.init.model.Vehicle;
import com.init.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("Bike")
public class BikeService implements AdapterService<Vehicle> {

    @Override
    public void process(Vehicle vehicle){

        System.out.println("Inside bike service -"+vehicle.toString());

    }
}
